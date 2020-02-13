package Lesson02;//Авомат с вкусняшками

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Lesson02Ex1 {
    public static void main(String[] args) throws IOException {
        Coca coca = new Coca("CocaLite",2.4, "a1");
        Mars mars = new Mars("MarsWithNuts",2.1, "a2");
        Milk milk = new Milk("Ostankino",1.2, "b1");
        Snic snic = new Snic("Snickers",2.7, "b2");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Внесите сумму в $: ");
        double a = Double.parseDouble(reader.readLine());
        System.out.println("Укажите позицию товара в формате \"Ряд\" и \"Номер\" (Пример: a2): ");
        String y = reader.readLine();
        if (y.equals(coca.position)){
            if (a > coca.cost){
                double q1 = a - coca.cost;
                BigDecimal q = new BigDecimal(q1).setScale(2,RoundingMode.HALF_UP);
                System.out.println("Спасибо за покупку! Заберите Вашу сачу: " + q + "$");
            }
            else if (a == coca.cost){
                System.out.println("Спасибо за покупку!");
            }
            else if (a < coca.cost){
                System.out.println("Недостаточно средств!");
            }
            else {
                System.out.println("Ошибка ввода");
            }
        }
        else if  (y.equals(mars.position)){
            if (a > mars.cost){
                double q1 = a - mars.cost;
                BigDecimal q = new BigDecimal(q1).setScale(2,RoundingMode.HALF_UP);
                System.out.println("Спасибо за покупку! Заберите Вашу сачу: " + q + "$");
            }
            else if (a == mars.cost){
                System.out.println("Спасибо за покупку!");
            }
            else if (a < mars.cost){
                System.out.println("Недостаточно средств!");
            }
            else {
                System.out.println("Ошибка ввода");
            }
        }
        else if (y.equals(milk.position)){
            if (a > milk.cost){
                double q1 = a - milk.cost;
                BigDecimal q = new BigDecimal(q1).setScale(2,RoundingMode.HALF_UP);
                System.out.println("Спасибо за покупку! Заберите Вашу сачу: " + q + "$");
            }
            else if (a == milk.cost){
                System.out.println("Спасибо за покупку!");
            }
            else if (a < milk.cost){
                System.out.println("Недостаточно средств!");
            }
            else {
                System.out.println("Ошибка ввода");
            }
        }
        else if (y.equals(snic.position)){
            if (a > snic.cost){
                double q1 = a - snic.cost;
                BigDecimal q = new BigDecimal(q1).setScale(2,RoundingMode.HALF_UP);
                System.out.println("Спасибо за покупку! Заберите Вашу сачу: " + q + "$");
            }
            else if (a == snic.cost){
                System.out.println("Спасибо за покупку!");
            }
            else if (a < snic.cost){
                System.out.println("Недостаточно средств!");
            }
            else {
                System.out.println("Ошибка ввода");
            }
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
