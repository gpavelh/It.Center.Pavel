package Lesson06;

import java.util.*;

public class Lesson06Ex1 {
    public static class PersonSuperComparator{
        public static class SortByName implements Comparator<Person>{
            @Override
            public int compare(Person o1, Person o2) {
                String name1 = o1.getName();
                String name2 = o2.getName();
                return name1.compareTo(name2);
            }
        }
        public static class SortByAge implements Comparator<Person>{

            @Override
            public int compare(Person o1, Person o2) {
                int age1 = o1.getAge();
                int age2 = o2.getAge();

                if (age1 > age2){
                    return -1;
                }
                else if (age1 < age2){
                    return 1;
                }
                else {
                    return 0;
                }
            }
        }
    }
    public static class Person {
        String name;
        int age;
        Person(String name, int age){
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }

        public static void main(String[] args) {
            Person[] list = new Person[3];
            list[0] = (new Person("Nora",5));
            list[1] = (new Person("Bita", 2));
            list[2] = (new Person("Al9",4));
            Arrays.sort(list, new PersonSuperComparator.SortByAge());
            System.out.println("Соритровка по возрасту");
            for (Person s: list
                 ) {
                System.out.println(s.toString());
            }
            Arrays.sort(list, new PersonSuperComparator.SortByName());
            System.out.println("Соритровка по имени");
            for (Person s: list){
                System.out.println(s.toString());
            }
        }
    }
}
