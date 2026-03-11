package LW9.Examples1_Recursion;

public class Example02 {

    public static void main(String[] args) {
        m(1);
    }

    public static void m(int x) {
        if (x >= 20) {
            return;
        }

        m(2 * x + 1);
        System.out.println("x = " + x);
    }
}