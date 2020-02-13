package Lesson02;//Авомат с вкусняшками

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lesson02Ex1 {
    public static void main(String[] args) throws IOException {
        Coca coca = new Coca("CocaLite",2.4, "a1");
        Mars mars = new Mars("MarsWithNuts",2.1, "a2");
        Milk milk = new Milk("Ostankino",1.2, "b1");
        Snic snic = new Snic("Snickers",2.1, "b2");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Внесите сумму в $: ");
        int a = Integer.parseInt(reader.readLine());
        System.out.println("Укажите позицию товара в формате \"Ряд\" и \"Номер\" (Пример: a2): ");
        String y = reader.readLine();
        if (y == coca.position){
            if ()
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
