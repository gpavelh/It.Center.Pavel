package Test;

public class Test4 implements Testier{
        String name;
        int weight;
        public static void main(String[] args) {
            Test4 test4 = new Test4();
            test4.name = "yka";
            test4.weight = 20;
            String ykaname = test4.getName();
            int ykaweight = test4.getWeight();
            System.out.println(ykaname + ykaweight);
        }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getWeight() {
        return weight;
    }
}
