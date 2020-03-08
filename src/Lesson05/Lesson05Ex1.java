package Lesson05; //Одновление вендингового аппарата. Использование конструктора и взаимодействие с пользователем.

import Lesson02.Lesson02Ex1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Lesson05Ex1 {
    public enum Product {
        COLAVAN("Coca", "Кока-Кола Vanilla", 2.4, "a1"),
        MARSWNUTS("Mars", "Mars с Орехами", 2.1, "a2"),
        MILKCOUNT("Milk", "Домик в деревне", 1.2, "b1"),
        SNICSUPER("Snic", "Snickers Super", 2.7, "b2");
        private final String name;
        private final String type;
        private final double cost;
        private final String position;

        Product(String name, String type, double cost, String position) {
            this.name = name;
            this.type = type;
            this.cost = cost;
            this.position = position;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("---------------------------------------------------------------------");
        System.out.println("|                          SUPER WENDY                              |");
        System.out.println("---------------------------------------------------------------------");
        System.out.println("| Напиток:       " + Product.COLAVAN.type + "     Цена:  " + Product.COLAVAN.cost + "$" + "     Позиция:  " + Product.COLAVAN.position + " |");
        System.out.println("| Шоколадка:     " + Product.MARSWNUTS.type + "        Цена:  " + Product.MARSWNUTS.cost + "$" + "     Позиция:  " + Product.MARSWNUTS.position + " |");
        System.out.println("| Напиток:       " + Product.MILKCOUNT.type + "       Цена:  " + Product.MILKCOUNT.cost + "$" + "     Позиция:  " + Product.MILKCOUNT.position + " |");
        System.out.println("| Шоколадка:     " + Product.SNICSUPER.type + "        Цена:  " + Product.SNICSUPER.cost + "$" + "     Позиция:  " + Product.SNICSUPER.position + " |");
        System.out.println("---------------------------------------------------------------------");
        System.out.println("Внесите сумму в $: ");

        double a = Double.parseDouble(reader.readLine());
        System.out.println("Укажите позицию товара в формате \"Ряд\" и \"Номер\" (Пример: a2): ");
        String selectedItem = reader.readLine();

        if (selectedItem.equals(Product.COLAVAN.position)) {
            method(a, Product.COLAVAN.cost);
        } else if (selectedItem.equals(Product.MARSWNUTS.position)) {
            method(a, Product.MARSWNUTS.cost);
        } else if (selectedItem.equals(Product.MILKCOUNT.position)) {
            method(a, Product.MILKCOUNT.cost);
        } else if (selectedItem.equals(Product.SNICSUPER.position)) {
            method(a, Product.SNICSUPER.cost);
        } else {
            System.out.println("Ошибка ввода");
        }
    }

    public static void method(double a, double cost) {
        if (a > cost) {
            double q1 = a - cost;
            BigDecimal q = new BigDecimal(q1).setScale(2, RoundingMode.HALF_UP);
            System.out.println("Спасибо за покупку !" + " Заберите Вашу сачу: " + q + "$");
        } else if (a == cost) {
            System.out.println("Спасибо за покупку!");
        } else if (a < cost) {
            System.out.println("Недостаточно средств!");
        } else {
            System.out.println("Ошибка ввода");
        }
    }
}

