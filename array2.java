package variablesoops;

public class array2 {
    int[] a = { 10, 20, 30, 40, 50 };

    public static void main(String[] args) {
        array1 s = new array1();

        for (int i = (s.a.length - 1); i >= 0; i--) {
            System.out.println(s.a[i]);
        }
    }
}