package Autoracing.Driver;

import Autoracing.Bus;

public class DriverD<D extends Bus> extends Driver {

    public D car;

    public DriverD(String driverName, boolean drivingLicense, int drivingExperience, D car) {
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
