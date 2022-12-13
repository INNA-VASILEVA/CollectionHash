package Autoracing.Mechanic;


import Autoracing.Transport.Transport;

public class Mechanic <T extends Transport> {
        private final String mechanicName;
        private final String company;

        public Mechanic(String mechanicName, String company) {
            this.mechanicName = mechanicName;
            this.company = company;
        }

        public String getMechanicName() {
            return mechanicName;
        }

        public String getCompany() {
            return company;
        }

        //boolean carryOutMaintenance(T t) {  // провести техническое обслуживание

        //    return t.servise();
        // }

        // boolean fixTheCar (T t) {  // починить машину
        //      return.t.fixTheCar();
        //  }
    }

