package Autoracing;

import Autoracing.Driver.DriverB;
import Autoracing.Driver.DriverC;
import Autoracing.Driver.DriverD;
import Autoracing.Mechanic.Mechanic;
import Autoracing.Sponsor.Sponsor;

import Autoracing.Driver.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Car> carSet = new HashSet<>();
        Set<Bus> burSet = new HashSet<>();
        Set<Truck> truckSet = new HashSet<>();
        Set<Driver> driverSet = new HashSet<>();
        Set<Mechanic> mechanicSet = new HashSet<>();
        Set<Sponsor> sponsorSet = new HashSet<>();

        Car ladaGranta = new Car("Lada", "Granta", 1.5);
        carSet.add(ladaGranta);
        Car chevroletEpica = new Car("Chevrolet Epica", "V250", 1.8);
        carSet.add(chevroletEpica);
        Car lada = new Car("Lada", "2107", 1.3);
        carSet.add(lada);
        Car hyundai = new Car("Hyundai", "Staria", 1.9);
        carSet.add(hyundai);
        carSet.add(ladaGranta); // Повтор для проверки исключения

        for(Car car : carSet) {
            System.out.println(car.toString());
        }


        Truck kamaz = new Truck("КамАЗ", "5490", 6);
        truckSet.add(kamaz);
        Truck gaz = new Truck("ГАЗ", "22107", 4);
        truckSet.add(gaz);
        Truck chana = new Truck("Chana", "SC1022DBN", 4);
        truckSet.add(chana);
        Truck fan = new Truck("FAW", "1031", 3);
        truckSet.add(fan);

        for(Truck truck : truckSet) {
            System.out.println(truck.toString());
        }


        Bus gazel = new Bus("ГАЗЕЛЬ", "CITY", 7);
        burSet.add(gazel);
        Bus kavz = new Bus("КАВЗ", "4238", 6);
        burSet.add(kavz);
        Bus liaz = new Bus("ЛИАЗ", "5292", 6);
        burSet.add(liaz);
        Bus paz = new Bus("ВЕКТОР", "NEXT", 7.6);
        burSet.add(paz);

        for(Bus bus : burSet) {
            System.out.println(bus.toString());
        }

        DriverB driver1 = new DriverB("Иванов А.С.", true, 15, ladaGranta);
        driverSet.add(driver1);
        DriverC driver2 = new DriverC("Петров В.А.", true, 9, kamaz);
        driverSet.add(driver2);
        DriverD driver3 = new DriverD("Сидоров Д.В.", true, 5, gazel);
        driverSet.add(driver3);
        driverSet.add(driver3);

        for(Driver driver : driverSet) {
            System.out.println(driver.toString());
        }


        System.out.println("Водитель" + driver1.toString() + "\nуправляет автомобилем " + driver1.car + " и будет участвовать в заезде");
        System.out.println("Водитель" + driver2.toString() + "\nуправляет автомобилем " + driver2.car + " и будет участвовать в заезде");
        System.out.println("Водитель" + driver3.toString() + "\nуправляет автомобилем " + driver3.car + " и будет участвовать в заезде");
        driver3.startMoving();
        driver3.stop();
        driver3.refuelTheCar();

        // ---------------------------------------------------------------------------------
        ladaGranta.addDriver(driver1);
        gaz.addDriver(driver2);
        liaz.addDriver(driver3);
        Sponsor sponsor1 = new Sponsor("Петров А.Ф.", 100000);
        sponsorSet.add(sponsor1);
        Sponsor sponsor2 = new Sponsor("Чистяков К.А.", 670000);
        sponsorSet.add(sponsor2);
        for(Sponsor sponsor : sponsorSet) {
            System.out.println(sponsor.toString());
        }

        ladaGranta.addSponsor(sponsor1);
        ladaGranta.addSponsor(sponsor2);
        System.out.print("У автомобиля " + ladaGranta.toString() + "\n" + ladaGranta.numSponsor() + " спонсоров  ");

        for (Sponsor sponsor : ladaGranta.getSponsors()) {
            System.out.print(sponsor.getSponsorName());
        }
        // -------------------------------------------------------------------------------------
        ServiceStation serviceStation = new ServiceStation();
        serviceStation.addCar(hyundai);
        serviceStation.addCar(lada);
        serviceStation.addCar(ladaGranta);
        serviceStation.maintenance();


        // -------- очередь в магазин----------------
        List<String> NAMES = List.of("Демидова О.С.", "Быченков А.В.", "Сидорова М.К.", "Трусов А.П.", "Сидоренко С.К.");
        Queue<String> cashRegister1 = new ArrayDeque<>();
        Queue<String> cashRegister2 = new ArrayDeque<>();
        cashRegister1.add(NAMES.get(4));
        cashRegister1.add(NAMES.get(1));
        cashRegister1.add(NAMES.get(3));
        cashRegister1.add(NAMES.get(2));
        cashRegister1.add(NAMES.get(0));

        cashRegister2.add(NAMES.get(1));
        cashRegister2.add(NAMES.get(2));
        cashRegister2.add(NAMES.get(3));
        cashRegister2.add(NAMES.get(4));

        System.out.println(cashRegister1.size());
        System.out.println(cashRegister2.size());


        if (cashRegister1.size() == 5 && cashRegister2.size() == 5) {
            System.out.println("Просьба позвать Галю");
        } else if (cashRegister1.size() < cashRegister2.size()) {
            addHuman(cashRegister1, NAMES.get(4));
        } else if (cashRegister1.size() > cashRegister2.size()) {
            addHuman(cashRegister2, NAMES.get(4));
        }

        System.out.println(cashRegister1.size());
        System.out.println(cashRegister2.size());


        example();
    }


    static void addHuman(Queue<String> queue, String name) {
        queue.add(name); // добавляем в очередь
    }

    static void example() {
        List<List<String>> biDemArrList = new ArrayList();
        for (int i = 0; i < 8; i++) {
            biDemArrList.add(i, new ArrayList<>());
            for (int j = 0; j < 8; j++) {
                biDemArrList.get(i).add(j, (i + j) % 2 == 1 ? "х" : "◯");
            }
        }
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(biDemArrList.get(i).get(j) + " ");
            }
            System.out.printf("\n");
        }
    }
}
