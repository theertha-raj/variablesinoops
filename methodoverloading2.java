package variablesoops;

public class methodoverloading2 {

    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public String add(String a, String b) {
        return a + b;
    }

    public static void main(String[] args) {
        methodoverloading2 calculator = new methodoverloading2();

        System.out.println(calculator.add(2, 3)); // Outputs: 5
        System.out.println(calculator.add(2, 3, 4)); // Outputs: 9
        System.out.println(calculator.add(2.5, 3.5)); // Outputs: 6.0
        System.out.println(calculator.add("Hello", " World")); // Outputs: Hello World
    }
}
