package Lesson01;//Расчет високосного года

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Lesson01Ex5 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String b = reader.readLine();
        int a = Integer.parseInt(b);
        if (a % 400 == 0)
            System.out.println("Високосный год");
        else if (a % 100 == 0)
            System.out.println("Не високосный год");
        else if (a % 4 == 0)
            System.out.println("Високосный год");
        else
            System.out.println("Не високосный год");

    }
}
