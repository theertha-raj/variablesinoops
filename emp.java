package variablesoops;

public class emp {
    String name;
    int age;

    public static void main(String[] args) {
        emp e1 = new emp();
        emp e2 = new emp();
        e1.name = "rathan";
        e2.name = "raj";
        System.out.println(e1.name);
        System.out.println(e2.name);
    }
}
