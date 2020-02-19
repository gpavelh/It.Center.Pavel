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
        cat.animalSwim();
        cat.animalRun();
    }

    @Override
    public void animalSwim() {
        System.out.println("Котик плавает");
    }

    @Override
    public void animalRun() {
        System.out.println("Котиик бежит");
    }
}
