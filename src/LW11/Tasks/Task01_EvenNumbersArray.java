package LW11.Tasks;

import java.util.Arrays;

/*  Напишите функцию, которая принимает на вход массив целых чисел и возвращает новый массив,
    содержащий только четные числа из исходного массива. */

public class Task01_EvenNumbersArray {
    public static int[] getEvenNumbers(int[] numbers) {
        return Arrays.stream(numbers)
                .filter(number -> number % 2 == 0)
                .toArray();
    }

    public static void main(String[] args) {
        int[] numbers = {12, 7, 4, 19, 24, 31, 8, 15};
        System.out.println("Исходный массив: " + Arrays.toString(numbers));
        System.out.println("Результат: " + Arrays.toString(getEvenNumbers(numbers)));
    }
}
