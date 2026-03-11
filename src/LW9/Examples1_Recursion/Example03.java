package LW9.Examples1_Recursion;

public class Example03 {

    public static void main(String[] args) {
        m(1);
    }

    public static void m(int x) {
        if (x >= 20) {
            return;
        }

        System.out.println("До рекурсивного вызова: x = " + x);
        m(2 * x + 1);
        System.out.println("После рекурсивного вызова: x = " + x);
    }
}