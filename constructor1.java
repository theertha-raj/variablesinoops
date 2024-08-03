package variablesoops;

public class constructor1 {
    String brand;
    double cost;

    constructor1(String brand, double cost) {
        this.brand = brand;
        this.cost = cost;
    }

    public static void main(String[] args) {
        constructor1 c = new constructor1("pulsar", 120000);
        System.out.println("brand :" + c.brand + "cost:" + c.cost);
        constructor1 c1 = new constructor1("honda", 100000);
        System.out.println("brand: " + c1.brand + "cost:" + c1.cost);
    }
}
