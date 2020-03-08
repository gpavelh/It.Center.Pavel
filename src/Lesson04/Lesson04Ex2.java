package Lesson04; //Поэкспериментировать с ключевым словом final

public class Lesson04Ex2 {
    public static void main(String[] args) {
    double a = 5;
    double b = 5;
    Test test = new Test();
    Test.addition(a,b);
    }
    static final class Test extends Lesson04Ex3.Calculator {

        public final static void addition(double a, double b) {
            final double answer = a * b;
            System.out.println((int)answer);
            }
    }
}
