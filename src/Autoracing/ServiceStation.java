package Autoracing;


import Autoracing.Transport.Transport;

import java.util.ArrayDeque;
import java.util.Queue;

public class ServiceStation {
    private  final Queue<Transport> transportQueue = new ArrayDeque<>();

    private void add (Transport transport) { // добавление очереди
        transportQueue.offer(transport);
    }

    void addCar (Car car) { // добавление легковых машин
        add(car);
    }
    void addTruck (Truck truck) { // добавление грузовых машин
        add(truck);
    }

    void maintenance() {
        if (!transportQueue.isEmpty()) {
            Transport transport =transportQueue.poll(); // удаление с очереди
            // обслуживание транспорта
            transport.servise();
        }
    }
}
