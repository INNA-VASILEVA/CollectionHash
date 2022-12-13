package Autoracing.Driver;

import Autoracing.Car;

public class DriverB<B extends Car> extends Driver {

    public B car;

    public DriverB(String driverName, boolean drivingLicense, int drivingExperience, B car) {
        super(driverName, drivingLicense, drivingExperience);
        this.car = car;
    }

    @Override
    public void startMoving() {
        System.out.println("начать движение");
    }

    @Override
    public void stop() {
        System.out.println("остановиться");
    }

    @Override
    public void refuelTheCar() {
        System.out.println("заправить авто");
    }
}
