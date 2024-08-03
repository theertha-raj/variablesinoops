package variablesoops;

import java.util.Scanner;

public class localvariable1 {
    int a;
    int b;

    int add(int a, int b) {
        int c = a;
        int d = b;
        return c + d;
    }

    public static void main(String[] args) {
        localvariable1 sc = new localvariable1();
        sc.a = 5;
        sc.b = 10;
        int result = sc.add(sc.a, sc.b);
        System.out.println(result);
    }

}
