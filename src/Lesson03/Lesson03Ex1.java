package Lesson03;//Сортировка массива

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lesson03Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите количество элементов в массиве: ");
        int arrLength = scanner.nextInt();
        int[] arr = new int[arrLength];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(99);
        }
        System.out.println("До сортировки: " + Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int q = arr[j];
                    arr[j] = arr[i];
                    arr[i] = q;
                }
            }
        }
        System.out.println("После соритровки: " + Arrays.toString(arr));
    }
}
