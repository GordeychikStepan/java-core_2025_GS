package LW6.Task6;

/*  Напишите программу со статическим методом, которому аргументом передается целочисленный массив
    и целое число. Результатом метод возвращает ссылку на новый массив, который получается
    из исходного массива (переданного первым аргументом методу), если в нем взять несколько
    начальных элементов. Количество элементов, которые нужно взять из исходного массива,
    определяются вторым аргументом метода. Если второй аргумент метода больше длины массива,
    переданного первым аргументом, то методом создается копия исходного массива и возвращается
    ссылка на эту копию. */

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] original = {1, 2, 3, 4, 5};

        int[] a = ArrayUtils.takeFirst(original, 3);
        int[] b = ArrayUtils.takeFirst(original, 10);
        int[] c = ArrayUtils.takeFirst(original, 0);

        System.out.println("Исходный массив: " + Arrays.toString(original));
        System.out.println("Первые 3 элемента: " + Arrays.toString(a));
        System.out.println("count > длины: " + Arrays.toString(b));
        System.out.println("count = 0: " + Arrays.toString(c));
    }
}
