package LW6.Task5;

public class SquareSum {

    // Статический метод вычисления суммы квадратов
    public static long sumOfSquares(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("n должно быть натуральным числом");
        }

        long sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += (long) i * i;
        }
        return sum;
    }

    // Проверка по формуле: n(n + 1)(2n + 1) / 6
    public static long sumByFormula(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("n должно быть натуральным числом");
        }

        return (long) n * (n + 1) * (2L * n + 1) / 6;
    }
}
