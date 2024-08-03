package variablesoops;

public class nonstatic2 {
    String brand = "nexon";

    void start() {
        System.out.println("car Started");
    }

    public static void main(String[] args) {
        nonstatic2 car1 = new nonstatic2();
        nonstatic2 car2 = new nonstatic2();
        System.out.println("Brand:" + car1.brand);
        car1.start();
        car2.brand = "Suzuki";
        System.out.println("Brand:" + car2.brand);

    }
}