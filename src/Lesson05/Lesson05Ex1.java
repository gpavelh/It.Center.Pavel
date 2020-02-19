package Lesson05;

import Lesson02.Lesson02Ex1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Lesson05Ex1 {
    public enum Product{
        COLAVAN, FANTALIME, MARSWNUTS, MILKCOUNT, MILKSHOKOLATE, SNICSUPER, SNICORIG;}
    public static void main(String[] args) throws IOException {
        Lesson05Ex1.Coca coca = new Lesson05Ex1.Coca("Кока-Кола Vanilla", 2.4, "a1");
        Lesson05Ex1.Mars mars = new Lesson05Ex1.Mars("Mars с Орехами", 2.1, "a2");
        Lesson05Ex1.Milk milk = new Lesson05Ex1.Milk("Домик в деревне", 1.2, "b1");
        Lesson05Ex1.Snic snic = new Lesson05Ex1.Snic("Snickers Super", 2.7, "b2");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("---------------------------------------------------------------------");
        System.out.println("|                          SUPER WENDY                              |");
        System.out.println("---------------------------------------------------------------------");
        System.out.println("| Напиток:       " + coca.name + "     Цена:  " + coca.cost + "$" + "     Позиция:  " + coca.position + " |");
        System.out.println("| Шоколадка:     " + mars.name + "        Цена:  " + mars.cost + "$" + "     Позиция:  " + mars.position + " |");
        System.out.println("| Напиток:       " + milk.name + "       Цена:  " + milk.cost + "$" + "     Позиция:  " + milk.position + " |");
        System.out.println("| Шоколадка:     " + snic.name + "        Цена:  " + snic.cost + "$" + "     Позиция:  " + snic.position + " |");
        System.out.println("---------------------------------------------------------------------");
        System.out.println("Внесите сумму в $: ");
        double a = Double.parseDouble(reader.readLine());
        if (a == -9999){
            for (Product s : Product.values()) {
                System.out.println(s);
                }
            return;
        }
        System.out.println("Укажите позицию товара в формате \"Ряд\" и \"Номер\" (Пример: a2): ");
        String y = reader.readLine();
        if (y.equals(coca.position)) {
            method(a, coca.cost);
        }
        else if (y.equals(mars.position)) {
            method(a, mars.cost);
        }
        else if (y.equals(milk.position)) {
            method(a, milk.cost);
        }
        else if (y.equals(snic.position)) {
            method(a, snic.cost);
        }
        else {
            System.out.println("Ошибка ввода");
        }
    }
    public static void method(double a, double cost){
        if (a > cost) {
            double q1 = a - cost;
            BigDecimal q = new BigDecimal(q1).setScale(2, RoundingMode.HALF_UP);
            System.out.println("Спасибо за покупку !" + " Заберите Вашу сачу: " + q + "$");
        }
        else if (a == cost) {
            System.out.println("Спасибо за покупку!");
        }
        else if (a < cost) {
            System.out.println("Недостаточно средств!");
        }
        else {
            System.out.println("Ошибка ввода");
        }
    }
    public static class Coca{
        String name;
        Double cost;
        String position;

        public Coca(String name, double cost, String position){
            this.name = name;
            this.cost = cost;
            this.position = position;
        }
    }
    public static class Mars {
        String name;
        double cost;
        String position;

        public Mars(String name, double cost, String position){
            this.name = name;
            this.cost = cost;
            this.position = position;
        }
    }
    public static class Milk {
        String name;
        double cost;
        String position;

        public Milk(String name, double cost, String position){
            this.name = name;
            this.cost = cost;
            this.position = position;
        }
    }
    public static class Snic {
        String name;
        double cost;
        String position;

        public Snic (String name, double cost, String position){
            this.name = name;
            this.cost = cost;
            this.position = position;
        }
    }
}

