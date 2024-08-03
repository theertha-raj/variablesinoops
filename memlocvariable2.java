package variablesoops;

public class memlocvariable2 {
    double height = 5.5; // member variable

    void display() {
        double height = 5.8; // local variable
        System.out.println(height);
        System.out.println(this.height);
    }

    public static void main(String[] args) {
        memlocvariable2 v = new memlocvariable2();
        v.display();
    }
}
