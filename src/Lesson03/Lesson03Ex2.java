package Lesson03;//Двумерный массив и сумма диагоналей

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Lesson03Ex2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int[][] arr = new int[a][a];
        Random qa = new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = qa.nextInt(11);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        int sum1 = 0, sum2 = 0;
        for (int i = 0,j = 0; i < a;i++,j++){
            sum1 += arr[i][j];
        }
        for (int i = a-1,j = 0; i >= 0; i--,j++) {
            sum2 += arr[i][j];
        }
        System.out.println(sum1+sum2);
    }
}
