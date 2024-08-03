package variablesoops;

public class array1 {
    int[] a = { 10, 20, 30, 40, 50 };

    public static void main(String[] args) {
        array1 s = new array1();

        for (int i = 1; i < s.a.length; i++) {
            System.out.println(s.a[i]);
        }
    }
}
