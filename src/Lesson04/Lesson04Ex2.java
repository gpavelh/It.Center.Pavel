package Lesson04;

public class Lesson04Ex2 {
    public static void main(String[] args) {
    double a = 5, b = 5;
    Test test = new Test();
    Test.addition(a,b);
    }
    static final class Test extends Lesson04Ex3.Calculator {

        public static void addition(double a, double b) {
            double ans = a * b;
            System.out.println((int)ans);
            }
    }
}
