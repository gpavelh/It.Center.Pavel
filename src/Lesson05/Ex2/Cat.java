package Lesson05.Ex2;

import Lesson05.Ex3.Run;
import Lesson05.Ex3.Swim;

public class Cat extends Animal implements Run, Swim {
    public String name;
    public Cat(String name){
        this.name = name;
    }
    @Override
    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Cat cat = new Cat("Yka");
        System.out.println(cat.getName());
        cat.actionSwim();
        cat.actionRun();
    }

    @Override
    public void actionSwim() {
        System.out.println("Котик плавает");
    }

    @Override
    public void actionFastSwim() {
        System.out.println("Котик быстро плавает");
    }

    @Override
    public void actionRun() {
        System.out.println("Котик бежит");
    }

    @Override
    public void actionFastRun() {
        System.out.println("Котик быстро бежит");
    }
}
