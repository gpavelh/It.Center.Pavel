package Test;

import java.util.ArrayList;
import java.util.List;

public class Test1 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        checkArray(list);
    }

    public static void checkArray(List<String> list) {
        String best = list.get(0);

        for (int i = 1; i < list.size(); i++) {

            String[] var = list.get(i).split(",");
            String[] bestStudentVar = best.split(",");

            if (Integer.parseInt(var[1]) > Integer.parseInt(bestStudentVar[1])) {
                best = list.get(i);
            }
        }
        System.out.println(best.split(",")[0]);
    }
}

