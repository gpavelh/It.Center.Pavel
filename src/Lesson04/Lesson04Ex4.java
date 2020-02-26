package Lesson04; //Счетчик создания класса Count. Для примера вязто число 10.

public class Lesson04Ex4 {
    public static void main(String[] args) {
        for (int i = 0; i < 10 ; i++) {
            Count count = new Count();
        }
        getCount();
    }

    public static void getCount(){
        System.out.println(Count.count);
}

    public static class Count{
        static int count = 0;

        public Count(){
            count++;
        }
    }
}
