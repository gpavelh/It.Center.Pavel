package Lesson05.Ex2;

public class Dog extends Animal{
    public String name;
    public Dog(String name){
        this.name = name;
    }
    @Override
    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Dog dog = new Dog("Pesel'");
        System.out.println(dog.getName());
    }
}
