package Lesson05.Ex4;

public class Devisee02 extends Devisee01 {
    @Override
    public void actionFastSwim() {
        super.actionFastSwim();
    }

    @Override
    public void actionFastRun() {
        super.actionFastRun();
    }

    @Override
    public void actionRun() {
        System.out.println("Не побегу!!!");
    }

    @Override
    public void actionSwim() {
        System.out.println("И плавать не буду!!");
    }

    public static void main(String[] args) {
        Devisee02 dev2 = new Devisee02();
        dev2.actionFastRun();
        dev2.actionRun();
        dev2.actionFastSwim();
        dev2.actionSwim();
    }
}
