package Lesson06.Ex3;

import java.util.*;

public class Lesson06Ex3 {
    public boolean isUnique(Map<String, String> map) {
        int count = 0;
        String[] values = map.values().toArray(new String[0]);
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values.length; j++) {
                System.out.println(values[i] + "  " + values[j]);
                if (values[i].equals(values[j]) && i != j) {
                    count++;
                }
            }
        }
        if (count / 2 <= 1) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("Вася", "Иванов");
        map.put("Петр", "Петров");
        map.put("Виктор", "Сидоров");
        map.put("Сергей", "Петя");
        map.put("Вадим", "Жора");
        map.put("Кашка", "Жора");
        Lesson06Ex3 ex3 = new Lesson06Ex3();
        System.out.println(ex3.isUnique(map));
    }
}
