package Lesson03; //Сортировка массива

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Lesson03Ex1 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random qa = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = qa.nextInt(99);
        }
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int q = arr[j];
                    arr[j] = arr[i];
                    arr[i] = q;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
