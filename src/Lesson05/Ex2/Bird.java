package Lesson05.Ex2;

import Lesson05.Ex3.Fly;
import Lesson05.Ex3.Swim;

public class Bird extends Animal implements Fly, Swim {
    public String name;
    public Bird(String name){
        this.name = name;
    }
    @Override
    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Bird bird = new Bird("Kesha");
        System.out.println(bird.getName());
        bird.actionFly();
        bird.actionSwim();
    }

    @Override
    public void actionFly() {
        System.out.println("Птица летит");

    }

    @Override
    public void actionSwim() {
        System.out.println("Птица плавает");
    }

    @Override
    public void actionFastSwim() {
        System.out.println("Птица быстро плавает");
    }
}
