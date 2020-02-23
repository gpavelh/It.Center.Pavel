package Test;

import java.util.*;

public class Test99 {
    public static void main(String[] args) {
        List collection = new ArrayList();
        collection.add(1);
        collection.add(2);
        collection.add("q");
        collection.set(2,4);
        for (Object s : collection) {
            System.out.println(s);
        }
        for (int i = 0; i < collection.size() ; i++) {
            System.out.println(collection.get(i));
        }
        Iterator iter = collection.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }
        Set collection2 = new HashSet();
        collection2.add("a");
        collection2.add("a");
        collection2.add("b");
        collection2.add("b");
        collection2.add("c");
        collection2.add("c");
        for (Object s: collection2
             ) {
            System.out.println(s);
        }
        Map collection3 = new HashMap();
        collection3.put(1, "BMW");
        collection3.put(2, "Ford");
        collection3.put(3, "Vaz");
        for (int i = 0; i <=collection3.size() ; i++) {
            System.out.println(collection3.get(i));
        }
        List<String> str = new ArrayList();
        str.add("w");
        str.add("b");
        str.add("c");
        for (Object s: str
             ) {
            System.out.println(s);
        }
        Queue qua = new PriorityQueue();
        qua.add("1");
        qua.add("2");
        for (Object s: qua
             ) {
            System.out.println(s);
        }

    }
}
