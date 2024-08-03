package variablesoops;

public class locmemvar {
    String name = "Rathan";

    // Method to demonstrate usage of local and member variables
    void name() {
        String name = "Raj"; // Local variable
        System.out.println(name); // Print local variable
        System.out.println(this.name); // Print member variable using 'this'
    }

    public static void main(String[] args) {
        locmemvar sc = new locmemvar();
        sc.name();
    }
}