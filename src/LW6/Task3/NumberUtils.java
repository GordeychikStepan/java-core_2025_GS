package LW6.Task3;

public class NumberUtils {

    // Наибольшее значение (произвольное количество аргументов)
    public static int max(int... numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Массив чисел пуст");
        }

        int max = numbers[0];
        for (int n : numbers) {
            if (n > max) {
                max = n;
            }
        }
        return max;
    }

    // Наименьшее значение
    public static int min(int... numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Массив чисел пуст");
        }

        int min = numbers[0];
        for (int n : numbers) {
            if (n < min) {
                min = n;
            }
        }
        return min;
    }

    // Среднее значение
    public static double average(int... numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Массив чисел пуст");
        }

        int sum = 0;
        for (int n : numbers) {
            sum += n;
        }
        return (double) sum / numbers.length;
    }
}
