package Lesson04; //Калькулятор. Следуйте подсказкам в терминале.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Lesson04Ex3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите первое число: ");
        double a = Double.parseDouble(reader.readLine());
        System.out.println("Введите второе число: ");
        double b = Double.parseDouble(reader.readLine());
        System.out.println("Выберите тип операции:\n 1 - \"Сложение\"  2 - \"Вычитание\"  3 - \"Умножение\"  4 - \"Деление\"  5 - \"Процент от числа\"");
        int operationType = Integer.parseInt(reader.readLine());
        switch (operationType) {
            case (1):
                Calculator.addition(a, b);
                break;
            case (2):
                Calculator.subtraction(a, b);
                break;
            case (3):
                Calculator.multiplication(a, b);
                break;
            case (4):
                Calculator.division(a, b);
                break;
            case (5):
                Calculator.percent(a, b);
            default:
                System.out.println("Ошибка ввода");
        }

    }

    public static class Calculator {
        public static void addition(double a, double b) {
            double answer = a + b;
            if (answer % 1 == 0) {
                System.out.println("Ответ: " + (int) (answer));
            } else {
                BigDecimal ans1 = new BigDecimal(answer).setScale(1, RoundingMode.HALF_UP);
                System.out.println("Ответ: " + ans1);
            }
        }

        public static void subtraction(double a, double b) {
            double ans = a - b;
            if (ans % 1 == 0) {
                System.out.println("Ответ: " + (int) (ans));
            } else {
                BigDecimal ans1 = new BigDecimal(ans).setScale(1, RoundingMode.HALF_UP);
                System.out.println("Ответ: " + ans1);
            }
        }

        public static void multiplication(double a, double b) {
            double ans = a * b;
            if (ans % 1 == 0) {
                System.out.println("Ответ: " + (int) (ans));
            } else {
                BigDecimal ans1 = new BigDecimal(ans).setScale(1, RoundingMode.HALF_UP);
                System.out.println("Ответ: " + ans1);
            }
        }

        public static void division(double a, double b) {
            double ans = a / b;
            if (ans % 1 == 0) {
                System.out.println("Ответ: " + (int) (ans));
            } else {
                BigDecimal ans1 = new BigDecimal(ans).setScale(1, RoundingMode.HALF_UP);
                System.out.println("Ответ: " + ans1);
            }
        }

        public static void percent(double a, double b) {
            double ans = b * (a / 100);
            if (ans % 1 == 0) {
                System.out.println("Ответ: " + (int) (ans));
            } else {
                BigDecimal ans1 = new BigDecimal(ans).setScale(1, RoundingMode.HALF_UP);
                System.out.println("Ответ: " + ans1);
            }
        }

    }
}
