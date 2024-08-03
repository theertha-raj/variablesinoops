package variablesoops;

import java.util.Scanner;

public class methodoverloading {
    void display(String name) {
        System.out.println(name);
    }

    void display(int age) {
        System.out.println(age);
    }

    void display(String name, int age) {
        System.out.println(name + " " + age);
    }

    void display(int age, String name) {
        System.out.println(age + " " + name);
    }

    public static void main(String[] args) {
        methodoverloading sc = new methodoverloading();
        sc.display("rathan", 21); // method call with string and integer
        sc.display("Raj"); // method call with single string argument
        sc.display(21); // method call with single integer argument
        sc.display("basava", 21); // method call with string and integer arguments
    }
}