package LW11.Tasks;

import java.util.Arrays;

/*  Напишите функцию, которая принимает на вход два массива целых чисел и возвращает новый массив,
    содержащий только те элементы, которые есть в обоих массивах. */

public class Task02_CommonElementsArray {
    public static int[] getCommonElements(int[] first, int[] second) {
        return Arrays.stream(first)
                .filter(value -> Arrays.stream(second).anyMatch(secondValue -> secondValue == value))
                .distinct()
                .toArray();
    }

    public static void main(String[] args) {
        int[] first = { 2, 4, 6, 8, 10, 12, 12 };
        int[] second = { 1, 2, 3, 6, 9, 12, 15 };

        System.out.println("Первый массив: " + Arrays.toString(first));
        System.out.println("Второй массив: " + Arrays.toString(second));
        System.out.println("Результат: " + Arrays.toString(getCommonElements(first, second)));
    }
}
