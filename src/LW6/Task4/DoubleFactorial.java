package LW6.Task4;

public class DoubleFactorial {

    // Статический метод вычисления двойного факториала
    public static long calc(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Число должно быть положительным");
        }

        // По определению: 0!! = 1 и 1!! = 1
        long result = 1;

        for (int i = n; i > 1; i -= 2) {
            result *= i;
        }

        return result;
    }
}
