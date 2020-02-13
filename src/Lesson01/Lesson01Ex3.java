package Lesson01;//Вывод на экран таблицы умножения

public class Lesson01Ex3 {
    public static void main(String [] args){
        for (int i = 1; i <=10; i++){
            for(int y = 1; y <= 10; y++){
                if (y == 10){
                    System.out.println(i*y);
                }
                else
                    System.out.print(i*y + " ");
            }
        }
    }
}
