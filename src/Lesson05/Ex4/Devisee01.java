package Lesson05.Ex4;

public class Devisee01 extends Human {
    @Override
    public void actionFastSwim() {
        System.out.println("Быстро прыви");
    }

    @Override
    public void actionFastRun() {
        System.out.println("Быстро беги");
    }

    public static void main(String[] args) {
        Devisee01 dev = new Devisee01();
        dev.actionRun();
        dev.actionSwim();
        dev.actionFastRun();
        dev.actionFastSwim();
    }
}
