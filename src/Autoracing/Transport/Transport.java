package Autoracing.Transport;

import Autoracing.Mechanic.Mechanic;
import Autoracing.Sponsor.Sponsor;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class Transport {

    private String brand;
    private String model;
    private int yearOfRelease;
    private String countryOfManufacture;
    private String bodyColor;
    private int maximumMovementSpeed;

    private List<Sponsor> sponsors = new ArrayList<>();
    private List<Mechanic> mechanics = new ArrayList<>();

    static private final String errInfo = "Информация не указана";


    public Transport(String brand, String model, int yearOfRelease, String countryOfManufacture, String bodyColor, int maximumMovementSpeed) {
        setBrand(brand);
        setModel(model);
        this.yearOfRelease = yearOfRelease;
        this.countryOfManufacture = (countryOfManufacture == null || countryOfManufacture.isBlank()) ? errInfo : countryOfManufacture;
        setBodyColor(bodyColor);
        setMaximumMovementSpeed(maximumMovementSpeed);
    }

    public Transport(String brand, String model) {
        setBrand(brand);
        setModel(model);
    }

    public void addMechanic (Mechanic mechanic) {
        mechanics.add(mechanic);
    }

    public void addSponsor(Sponsor sponsor) {
        sponsors.add(sponsor);
    }

    public int numSponsor () {
        return  sponsors.size();
    }

    public List<Sponsor> getSponsors () {
        return sponsors;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = (brand == null || brand.isBlank()) ? errInfo : brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = (model == null || model.isBlank()) ? errInfo : model;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public String getCountryOfManufacture() {
        return countryOfManufacture;
    }

    public String getBodyColor() {
        return bodyColor;
    }

    public void setBodyColor(String bodyColor) {
        this.bodyColor = (bodyColor == null || bodyColor.isBlank()) ? errInfo : bodyColor;
    }

    @Override
    public String toString() {
        return brand + " " + model;
    }

    public int getMaximumMovementSpeed() {
        return maximumMovementSpeed;
    }

    public void setMaximumMovementSpeed(int maximumMovementSpeed) {
        this.maximumMovementSpeed = maximumMovementSpeed;
    }

    public abstract String refill();

    public abstract void servise();

    public abstract void fixTheCar();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return yearOfRelease == transport.yearOfRelease && maximumMovementSpeed == transport.maximumMovementSpeed && Objects.equals(brand, transport.brand) && Objects.equals(model, transport.model) && Objects.equals(countryOfManufacture, transport.countryOfManufacture) && Objects.equals(bodyColor, transport.bodyColor) && Objects.equals(sponsors, transport.sponsors) && Objects.equals(mechanics, transport.mechanics);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, yearOfRelease, countryOfManufacture, bodyColor, maximumMovementSpeed, sponsors, mechanics);
    }
}
