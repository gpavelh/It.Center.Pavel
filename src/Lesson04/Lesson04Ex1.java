package Lesson04; //Автозамена всех слов «бяка» на «вырезано цензурой» и вывод результата в консоль!

public class Lesson04Ex1 {
    public static void main(String[] args) {
        String text = "Детские песенки - Песенки для детей - Бяка. Это длинная - полная версия песенки Бяка про продукты. Весёлая песенка Бяка про сочетание продуктов в еде, кому как вк...";
        String textFix = text.replace("Бяка","*Вырезано цензурой!*");
        System.out.println(textFix);
    }
}
