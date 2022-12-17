package Autoracing.Driver;

public abstract class Driver<T> {

    private final String driverName;
    private final boolean drivingLicense;
    private final int drivingExperience;

    public Driver(String driverName, boolean drivingLicense, int drivingExperience) {
        this.driverName = driverName;
        this.drivingLicense = drivingLicense;
        this.drivingExperience = drivingExperience;
    }

    @Override
    public String toString() {
        return " " + driverName;
    }

    abstract void startMoving();

    abstract void stop();

    abstract void refuelTheCar();
}