package LW3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*  Напишите программу, в которой создается массив и заполняется
    случайными числами. Массив отображается в консольном окне. В этом
    массиве необходимо определить элемент с минимальным значением. В
    частности, программа должна вывести значение элемента с минимальным
    значением и индекс этого элемента. Если элементов с минимальным
    значением несколько, должны быть выведены индексы всех этих элементов. */

public class Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n <= 0) return;

        int[] a = new int[n];
        Random rnd = new Random();
        for (int i = 0; i < n; i++) a[i] = rnd.nextInt(200);

        System.out.println(Arrays.toString(a));

        int min = a[0];
        for (int x : a) if (x < min) min = x;

        System.out.print("Минимум: " + min + ", индексы: ");
        boolean first = true;
        for (int i = 0; i < n; i++) if (a[i] == min) {
            if (!first) System.out.print(", ");
            System.out.print(i);
            first = false;
        }
        System.out.println();
    }
}
