package Test;

public class Test1 {
    public static String a = "Hi!";
    int b = 0;
    double c = 0.0;

    public void say(){
        System.out.println(a);
    }
    public static void say2(){
        System.out.println(a + a);
    }

    public static void main(String[] args) {
        Test1 test1 = new Test1();
        test1.say();
        test1.say2();
        Test2 test2 = new Test2();
        test2.say();
        test2.say2();
        Yppi yppi = new Yppi();
        System.out.println(a.substring(0,1));
    }
    public static class Yppi{
        public static void say3(){
            System.out.println("Jora");
        }
        public Yppi() {
            System.out.println(Test1.a);
        }
    }
}
