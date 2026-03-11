package LW9.Examples1_Recursion;

public class Example01 {

    public static void main(String[] args) {
        m(1);
    }

    public static void m(int x) {
        if (x >= 20) {
            return;
        }

        System.out.println("x = " + x);
        m(2 * x + 1);
    }
}