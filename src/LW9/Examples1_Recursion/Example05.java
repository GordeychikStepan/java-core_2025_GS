package LW9.Examples1_Recursion;

public class Example05 {

    public static void main(String[] args) {
        int n = 6;

        System.out.println("Число Фибоначчи для n = " + n + ": " + fib(n));

        System.out.println("\nДерево рекурсивных вызовов:");
        fibTrace(n, 0);
    }

    public static int fib(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        return fib(n - 1) + fib(n - 2);
    }

    public static int fibTrace(int n, int level) {
        printIndent(level);
        System.out.println("fib(" + n + ")");

        if (n == 0) {
            printIndent(level);
            System.out.println("return 0");
            return 0;
        }

        if (n == 1) {
            printIndent(level);
            System.out.println("return 1");
            return 1;
        }

        int left = fibTrace(n - 1, level + 1);
        int right = fibTrace(n - 2, level + 1);
        int result = left + right;

        printIndent(level);
        System.out.println("fib(" + n + ") = " + result);

        return result;
    }

    private static void printIndent(int level) {
        for (int i = 0; i < level; i++) {
            System.out.print("  ");
        }
    }
}