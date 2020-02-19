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
        duck.animalFly();
        duck.animalRun();
        duck.animalSwim();
    }

    @Override
    public void animalFly() {
        System.out.println("Утка летит");
    }

    @Override
    public void animalRun() {
        System.out.println("Утка бежит");
    }

    @Override
    public void animalSwim() {
        System.out.println("Утка плавает");
    }
}
