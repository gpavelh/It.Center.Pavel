package Lesson06;

import java.util.*;

public class Lesson06Ex4 {
    public Set<String> removeEvenLenght(Set<String> set){
        Set<String> finish = new HashSet<>();
        for (String q: set
             ) {
            if (q.length() % 2 != 0) {
                finish.add(q);
            }
        }
        return finish;
    }

    public static void main(String[] args) {
        Set<String> words = new HashSet<>();
        words.add("foo");
        words.add("buzz");
        words.add("bar");
        words.add("fork");
        words.add("bort");
        words.add("spoon");
        words.add("!");
        words.add("dude");
        words.add("dud1e");
        Lesson06Ex4 removeValues = new Lesson06Ex4();
        System.out.println(removeValues.removeEvenLenght(words));
    }
}
