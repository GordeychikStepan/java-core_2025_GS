package LW3;

import java.util.Scanner;

/*  Напишите программу, в которой вычисляется сумма чисел,
    удовлетворяющих таким критериям: при делении числа на 5 в остатке
    получается 2, или при делении на 3 в остатке получается 1 Количество чисел в
    сумме вводится пользователем. Программа отображает числа, которые
    суммируются, и значение суммы. Предложите версии программы,
    использующие разные операторы цикла. */

public class Task5_Var1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество чисел в сумме: ");
        int n = sc.nextInt();

        System.out.print("Подходящие числа: ");

        // Цикл for
        int count = 0;
        int sum = 0;

        for (int num = 1; count < n; num++) {
            if (num % 5 == 2 || num % 3 == 1) {
                System.out.print(num + " ");
                sum += num;
                count++;
            }
        }

        System.out.println("\nСумма = " + sum);
        sc.close();
    }
}
