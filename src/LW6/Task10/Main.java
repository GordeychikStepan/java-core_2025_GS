package LW6.Task10;

/*  Напишите программу со статическим методом, аргументом которому передается произвольное
    количество целочисленных аргументов. Результатом метод возвращает массив из двух элементов:
    это значения наибольшего и наименьшего значений среди аргументов, переданных методу. */

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] result = MinMaxFinder.findMinMax(5, 2, 9, -3, 7);

        System.out.println("Максимум и минимум: " + Arrays.toString(result));
        // result[0] — максимум, result[1] — минимум
    }
}
