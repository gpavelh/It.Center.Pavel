package Test;

import java.util.ArrayList;

public class Test6 {
    public static class Cat{
        private String  name;

        Cat(String name){
            this.name = name;
        }
    }
    public static void main(String[] args) {
        ArrayList<Cat> cats = new ArrayList<>();
        Cat cat = new Cat("Жора");
        Cat cat1 = new Cat("Витя");
        cats.add(cat);
        cats.add(cat1);
        System.out.println(cats.toString());
        cats.remove(0);
        System.out.println(cats.toString());
    }
}
