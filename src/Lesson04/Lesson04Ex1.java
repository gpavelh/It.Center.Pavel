package Lesson04;

public class Lesson04Ex1 {
    public static void main(String[] args) {
        String s = "Детские песенки - Песенки для детей - Бяка. Это длинная - полная версия песенки Бяка про продукты. Весёлая песенка Бяка про сочетание продуктов в еде, кому как вк...";
        String s2 = s.replace("Бяка","*Вырезано цензурой!*");
        System.out.println(s2);
    }
}
