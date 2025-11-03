package LW3;

import java.util.InputMismatchException;
import java.util.Scanner;

/*  Напишите программу, в которой создается одномерный числовой
    массив и заполняется числами, которые при делении на 5 дают в остатке 2
    (числа 2,7,12,17 и так далее). Размер массива вводится пользователем.
    Предусмотреть обработку ошибки, связанной с вводом некорректного
    значения. */

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Введите размер массива: ");
            int n = sc.nextInt();

            if (n <= 0) {
                System.out.println("Ошибка: размер массива должен быть положительным числом!");
                return;
            }

            int[] arr = new int[n];
            int value = 1;
            int count = 0;

            while (count < n) {
                if (value % 5 == 2) {
                    arr[count] = value;
                    count++;
                }
                value++;
            }

            System.out.print("Массив: ");
            for (int x : arr) {
                System.out.print(x + " ");
            }
        }
        catch (InputMismatchException e) {
            System.out.println("Ошибка: введите целое число!");
        }
        finally {
            sc.close();
        }
    }
}
