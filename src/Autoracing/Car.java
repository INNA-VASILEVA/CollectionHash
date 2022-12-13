package Autoracing;

import Autoracing.Driver.DriverB;
import Autoracing.Transport.Transport;

import java.util.*;

import java.util.ArrayList;
import java.util.List;

public final class Car extends Transport {

    private double engineCapacity;
    private String transmission;
    private String bodyType;
    private String registrationNumber;
    private int numberOfSeats;
    private boolean rubber;

    public List<DriverB> driver = new ArrayList<>();


    public Car(String brand, String model, int yearOfRelease, String countryOfManufacture, String bodyColor, int maximumMovementSpeed, double engineCapacity, String transmission, String bodyType, String registrationNumber, int numberOfSeats, boolean rubber) {
        super(brand, model, yearOfRelease, countryOfManufacture, bodyColor, maximumMovementSpeed);
        this.engineCapacity = engineCapacity; // Обьем двигателя
        this.transmission = transmission;
        this.bodyType = bodyType;
        this.registrationNumber = registrationNumber;
        this.numberOfSeats = numberOfSeats;
        this.rubber = rubber;
    }

    public Car(String brand, String model, double engineCapacity) {
        super(brand, model);
        this.engineCapacity = engineCapacity;
    }

    void addDriver(DriverB driverB) {
        driver.add(driverB);
    }

    @Override
    public String toString() {
        return super.toString() + " обьем двигателя=" + engineCapacity;
    }

    public double getEngineCapacity() {
        return this.engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public String getTransmission() {
        return this.transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getBodyType() {
        return this.bodyType;
    }

    public String getRegistrationNumber() {
        return this.registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public int getNumberOfSeats() {
        return this.numberOfSeats;
    }


    public boolean isRubber() {
        return this.rubber;
    }

    public void setRubber(boolean rubber) {
        this.rubber = rubber;
    }

    public String refill() {
        return "можно заправлять бензином, дизелем на заправке или заряжать на специальных электроду-парковках, если это электрокар";
    }


    public void servise() {
        System.out.println("\nМашина на обслуживании:" + toString());
    }

    public void fixTheCar() {
        System.out.println("\nМашина в ремонте: " + toString());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Car car = (Car) o;
        return Double.compare(car.engineCapacity, engineCapacity) == 0 && numberOfSeats == car.numberOfSeats && rubber == car.rubber && Objects.equals(transmission, car.transmission) && Objects.equals(bodyType, car.bodyType) && Objects.equals(registrationNumber, car.registrationNumber) && Objects.equals(driver, car.driver);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), engineCapacity, transmission, bodyType, registrationNumber, numberOfSeats, rubber, driver);
    }
}

