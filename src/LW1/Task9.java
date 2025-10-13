package LW1;

import java.util.Scanner;

/*  Напишите программу, в которой пользователь вводит число, а программой отображается последовательность
    из четырех чисел: число, на единицу меньше введённого, введенное число и число, на единицу больше введенного.
    Четвертое число должно быть квадратом суммы первых трех чисел. */

public class Task9 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int num = scanner.nextInt();

        int n1 = num - 1;
        int n3 = num + 1;
        int n4 = (int)Math.pow(n1 + num + n3, 2);

        System.out.print(n1 + " " + num + " " + n3 + " " + n4);

        scanner.close();
    }
}
