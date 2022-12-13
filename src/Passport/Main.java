package Passport;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        //-------------------- Домашнее задание 3 ----------------------
        //------------------------- Задание2 ---------------------------

        ArrayList<String> multiplicationTable = new ArrayList<>(28);
        Set<String> task = new HashSet<>(15);
        int index = 0;
        for (int i = 2; i < 9; i++) {
            for (int j = 2; j < 9; j++) {
                if (j >= i) {
                    String str = Integer.toString(i) + "*" + Integer.toString(j) + "=";
                    multiplicationTable.add(index, str);
                    index++;
                }
            }
        }

        for (int i = 0; i < 28; i++) {
            task.add(multiplicationTable.get((int) (Math.random() * 28)));
            if (task.size() >= 15) {
                break;
            }
        }
        int i = 1;
        for (String str : task) {
            System.out.println("Задание" + i + ": " + str);
            i++;
        }

        //------------------------- Задание3 ---------------------------
        LocalDate birthDay1 = LocalDate.of(1974, 5, 2);
        Passport passport = new Passport("111222", "Корольчук", "Владислав", "Викторович", birthDay1);
        LocalDate birthDay2 = LocalDate.of(1974, 2, 28);
        Passport passport1 = new Passport("222333", "Демидова", "Ольга", "Станиславовна", birthDay2);
        LocalDate birthDay3 = LocalDate.of(1973, 10, 25);
        Passport passport3 = new Passport("123456", "Иванов", "Александр", "Петрович", birthDay3);

        String str = Passport.getHuman("123456");
        System.out.println(str);
    }
}

