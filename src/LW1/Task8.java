package LW1;

import java.util.Scanner;

/*  Напишите программу для вычисления суммы двух чисел. Оба числа вводятся пользователем.
    Для вычисления суммы используйте оператор +. */

public class Task8 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите 1 число: ");
        int num1 = scanner.nextInt();

        System.out.print("Введите 2 число: ");
        int num2 = scanner.nextInt();

        System.out.print("\n" + num1 + " + " + num2 + " = " + (num1 + num2));

        scanner.close();
    }
}
