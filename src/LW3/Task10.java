package LW3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*  Напишите программу, в которой создается целочисленный
    массив, заполняется случайными числами и после этого значения элементов в
    массиве сортируются в порядке убывания значений. */

public class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Введите размер массива: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Ошибка: размер массива должен быть положительным числом!");
            return;
        }

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(100);
        }

        System.out.println("Исходный массив: " + Arrays.toString(arr));

        Arrays.sort(arr);

        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

        System.out.println("Массив после сортировки по убыванию: " + Arrays.toString(arr));

        sc.close();
    }
}
