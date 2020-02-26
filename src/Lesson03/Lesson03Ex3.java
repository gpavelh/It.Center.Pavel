package Lesson03;//Ряд Фибонначчи

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lesson03Ex3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите длинну ряда Фибонначчи: ");
        int N = Integer.parseInt(reader.readLine());
        for (int i = 0; i < N; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
    public static int fibonacci(int N){
        if (N == 0)
        {
            return 0;
        }
        if (N == 1)
        {
            return 1;
        }
        return fibonacci(N - 1)  + fibonacci(N - 2);
    }
}
