package Lesson05.Ex2;

import Lesson05.Ex3.Fly;
import Lesson05.Ex3.Run;
import Lesson05.Ex3.Swim;

public class Duck extends Animal implements Fly, Swim, Run {
    public String name;
    public Duck(String name){
        this.name = name;
    }
    @Override
    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Duck duck = new Duck("MacDuck");
        System.out.println(duck.getName());
        duck.actionFly();
        duck.actionRun();
        duck.actionSwim();
    }

    @Override
    public void actionFly() {
        System.out.println("Утка летит");
    }

    @Override
    public void actionRun() {
        System.out.println("Утка бежит");
    }

    @Override
    public void actionFastRun() {
        System.out.println("Утка быстро бежит");
    }

    @Override
    public void actionSwim() {
        System.out.println("Утка плавает");
    }

    @Override
    public void actionFastSwim() {
        System.out.println("Утка быстро плавает");
    }
}
