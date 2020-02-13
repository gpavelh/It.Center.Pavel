package Lesson02;//Авомат с вкусняшками

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Lesson02Ex1 {
    public static void main(String[] args) throws IOException {
        Coca coca = new Coca("Кока-Кола Vanilla",2.4, "a1");
        Mars mars = new Mars("Mars с Орехами",2.1, "a2");
        Milk milk = new Milk("Домик в деревне",1.2, "b1");
        Snic snic = new Snic("Snickers Super",2.7, "b2");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("---------------------------------------------------------------------");
        System.out.println("|                          SUPER WENDY                              |");
        System.out.println("---------------------------------------------------------------------");
        System.out.println("| Напиток:       " + coca.name +"     Цена:  " + coca.cost + "$"+ "     Позиция:  " + coca.position+" |");
        System.out.println("| Шоколадка:     " + mars.name +"        Цена:  " + mars.cost + "$"+ "     Позиция:  " + mars.position+" |");
        System.out.println("| Напиток:       " + milk.name +"       Цена:  " + milk.cost + "$"+ "     Позиция:  " + milk.position+" |");
        System.out.println("| Шоколадка:     " + snic.name +"        Цена:  " + snic.cost + "$"+ "     Позиция:  " + snic.position+" |");
        System.out.println("---------------------------------------------------------------------");
        System.out.println("Внесите сумму в $: ");
        double a = Double.parseDouble(reader.readLine());
        System.out.println("Укажите позицию товара в формате \"Ряд\" и \"Номер\" (Пример: a2): ");
        String y = reader.readLine();
        if (y.equals(coca.position)){
            if (a > coca.cost){
                double q1 = a - coca.cost;
                BigDecimal q = new BigDecimal(q1).setScale(2,RoundingMode.HALF_UP);
                System.out.println("Спасибо за покупку  " +coca.name +"!"+" Заберите Вашу сачу: " + q + "$");
            }
            else if (a == coca.cost){
                System.out.println("Спасибо за покупку" +coca.name +"!");
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
                System.out.println("Спасибо за покупку  " +mars.name +"!"+" Заберите Вашу сачу: " + q + "$");
            }
            else if (a == mars.cost){
                System.out.println("Спасибо за покупку" +mars.name +"!");
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
                System.out.println("Спасибо за покупку  " +milk.name +"!"+" Заберите Вашу сачу: " + q + "$");
            }
            else if (a == milk.cost){
                System.out.println("Спасибо за покупку" +milk.name +"!");
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
                System.out.println("Спасибо за покупку  " +mars.name +"!"+" Заберите Вашу сачу: " + q + "$");
            }
            else if (a == snic.cost){
                System.out.println("Спасибо за покупку" +mars.name +"!");
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
