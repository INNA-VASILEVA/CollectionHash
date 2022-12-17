package Exercises;

import java.util.HashMap;
import java.util.Map;

public class Exeecise {
    public static Map<String, Integer> hashMap = new HashMap<>();

    public static void main(String[] args) {
// --------------------------------------- Задание 1.3 -----------------------------------------------------------

        hashMap("str1", 5);
        hashMap("str2", 5);
        hashMap("str2", 6);
        hashMap("str2", 7);
    }

    private static void hashMap(String line, int num) {

        String Result = String.valueOf((hashMap.get(line)));
        if (String.valueOf((hashMap.get(line))) == "null") {         // Бакет не найден
            hashMap.put(line, num);
        } else if (hashMap.get(line) == num) {                       // Выкинуть исключение
            throw new IllegalArgumentException("Повтор ключ-значения");
        } else {                                                     // Перезаписываем
            hashMap.put(line, num);
        }
        System.out.println(hashMap);


    }
}
