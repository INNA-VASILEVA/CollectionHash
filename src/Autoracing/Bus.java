package Autoracing;

import Autoracing.Driver.DriverD;
import Autoracing.Transport.Transport;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class Bus extends Transport implements Competing {

    private double engineCapacity; // Обьем двигателя

    public List<DriverD> driver=new ArrayList<>();

    public Bus(String brand, String model, double engineCapacity) {
        super(brand, model);
        this.engineCapacity = engineCapacity;
    }

    void addDriver (DriverD driverD) {
        driver.add(driverD);
    }

    @Override
    public void pitStop() {
        System.out.println("Класс Автобус Пит-Стоп");
    }

    @Override
    public void bestLapTime() {
        System.out.println("Класс Автобус Лучшее время круга");
    }

    @Override
    public void voidmaximumSpeed() {
        System.out.println("Класс Автобус Максимальная скорость");
    }


    @Override
    public String refill() {
        return null;
    }

    @Override
    public void servise() {

    }

    @Override
    public void fixTheCar() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bus bus = (Bus) o;
        return Double.compare(bus.engineCapacity, engineCapacity) == 0 && Objects.equals(driver, bus.driver);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), engineCapacity, driver);
    }
}

