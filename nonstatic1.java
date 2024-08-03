package variablesoops;

public class nonstatic1 {
    String name;
    int age;

    public static void main(String[] args) {
        nonstatic1 e1 = new nonstatic1();
        e1.name = "vidya";
        System.out.println(e1.name);
        e1.age = 23;
        System.out.println(e1.age);
    }
}
