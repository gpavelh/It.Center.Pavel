package Lesson05.Ex2;

public class Cat extends Animal{
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
    }
}
