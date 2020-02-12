//Программа для поиска минимального из двух чисел

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine()), b = Integer.parseInt((reader.readLine()));
        if (a > b){
            System.out.println("Минимальное число " + b);
        }
        else {
            System.out.println("Минимальное число " + a);
        }
    }
}
