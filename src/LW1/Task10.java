package LW1;

import java.util.Scanner;

/*  Напишите программу, в которой Пользователь вводит два числа,
    а программой вычисляется и отображается сумма и разность этих чисел. */

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите 1 число: ");
        int num1 = scanner.nextInt();

        System.out.print("Введите 2 число: ");
        int num2 = scanner.nextInt();

        System.out.print("\nСумма: " + (num1 + num2) + "\nРазность: " + (num1 - num2));

        scanner.close();
    }
}
