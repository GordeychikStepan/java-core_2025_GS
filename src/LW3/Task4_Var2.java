package LW3;

import java.util.Scanner;

/*  Напишите программу, в которой пользователем вводится два
    целых числа. Программа выводит все целые числа — начиная с наименьшего
    (из двух введенных чисел) и заканчивая наибольшим (из двух введенных
    чисел). Предложите разные версии программы (с использованием разных
    операторов цикла). */

public class Task4_Var2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int max = Math.max(a, b);
        int min = Math.min(a, b);

        // Цикл while
        int i = min;

        while (i <= max) {
            System.out.print(i + " ");
            i++;
        }

        sc.close();
    }
}
