package Autoracing;

import Autoracing.Driver.DriverC;
import Autoracing.Transport.Transport;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class Truck extends Transport implements Diagnostics {

        private double engineCapacity; // Обьем двигателя
        public List<DriverC> driver=new ArrayList<>();

        public Truck(String brand, String model, double engineCapacity) {
            super(brand, model);
            this.engineCapacity = engineCapacity;
        }

        void addDriver (DriverC driverC) {
            driver.add(driverC);
        }

        public double getEngineCapacity() {
            return engineCapacity;
        }

        public void setEngineCapacity(double engineCapacity) {
            this.engineCapacity = engineCapacity;
        }


        public void startMoving() {
            System.out.println("Начать движение");
        }

        public void finishMovement() {
            System.out.println("Закончить движение");
        }


        public void passDiagnostics() {
            System.out.println("");
        }

    @Override
    public String refill() {
        return null;
    }

    public void servise() {
            System.out.println("Грузовая машина на обслуживании:" + toString());
        }

        public void  fixTheCar() {
            System.out.println("Грузовая машина в ремонте: " + toString());
        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Truck truck = (Truck) o;
        return Double.compare(truck.engineCapacity, engineCapacity) == 0 && Objects.equals(driver, truck.driver);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), engineCapacity, driver);
    }
}
