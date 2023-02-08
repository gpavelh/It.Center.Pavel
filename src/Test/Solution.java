package Test;


import java.awt.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream("C:\\Users\\gh\\Desktop\\data.txt");
        // Создаем поток-записи-байт-в-файл
        FileOutputStream outputStream = new FileOutputStream("C:\\Users\\gh\\Desktop\\result.txt");

        if (inputStream.available() > 0) {
            //читаем весь файл одним куском
            byte[] buffer = new byte[inputStream.available()];
            int count = inputStream.read(buffer);
            outputStream.write(buffer, 0, count);
        }

        inputStream.close();
        outputStream.close();
    }
}

























