package LW6.Task8;

public class ArrayAverage {

    // Статический метод вычисления среднего значения элементов массива
    public static double average(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Массив пуст или равен null");
        }

        long sum = 0;
        for (int value : array) {
            sum += value;
        }

        return (double) sum / array.length;
    }
}
