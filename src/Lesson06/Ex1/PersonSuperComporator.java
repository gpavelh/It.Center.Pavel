package Lesson06.Ex1;

import java.util.Comparator;

public class PersonSuperComporator implements Comparator<Person> {
    @Override
    public int compare(Person o1,Person o2) {
        String name1 = o1.getName();
        String name2 = o2.getName();
        if (name1.equals(name2)) {
            int age1 = o1.getAge();
            int age2 = o2.getAge();

            if (age1 > age2) {
                return 1;
            } else if (age1 < age2) {
                return -1;
            } else {
                return 0;
            }
        }
        return name1.compareTo(name2);
    }
}
