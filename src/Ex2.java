//Программа описывает введенное число. Отрицательное/положительное, четное/нечетное, нуль

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex2 {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        if (a < 0 && a % 2 == 0) {
            System.out.println("Число " + a + " отрицательне и четное");
        }
        else if (a > 0 && a % 2 == 0) {
            System.out.println("Число " + a + " положительное и четное");
        }
        else if (a < 0 && a % 2 != 0) {
            System.out.println("Число " + a + " отрицательне и нечетное");
        }
        else if (a > 0 && a % 2 != 0) {
            System.out.println("Число " + a + " положительное и нечетное");
        }
        else if (a == 0) {
            System.out.println("Число " + a + " нулевое");
        }

    }
}
