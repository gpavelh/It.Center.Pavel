package Lesson06.Ex1; //Реализован PersonSuperComparator, который имплементит Comparator и
//умеет сравнивать по двум параметрам: возраст и имя.


import Lesson06.Ex1.Person;
import Lesson06.Ex1.PersonSuperComporator;

import java.util.*;

public class Lesson06Ex1 {


        public static void main(String[] args) {
            Person[] list = new Person[4];
            list[0] = new Person("Nora",5);
            list[1] = new Person("Bita", 2);
            list[2] = new Person("Al9",60);
            list[3] = new Person("Al9",999);
            Arrays.sort(list, new PersonSuperComporator());
            System.out.println("Соритровка по Имени");
            for (Person s: list
                 ) {
                System.out.println(s.toString());
            }
        }
}

