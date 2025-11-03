package LW3;

import java.util.Scanner;

/*  Напишите программу, которая выводит последовательность чисел
    Фибоначчи. Первые два числа в этой последовательности равны 1, а каждое
    следующее число равно сумме двух предыдущих (получается
    последовательность 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89 и так далее). Количество
    чисел в последовательности вводится пользователем. Предложите версии
    программы, использующие разные операторы цикла. */

public class Task3_Var2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите количество чисел Фибоначчи: ");
        int n = sc.nextInt();

        // С циклом while
        int a = 1, b = 1;
        int i = 1;

        System.out.print("Последовательность: ");
        while (i <= n) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
            i++;
        }

        sc.close();
    }
}
