package LW9.Tasks;

import java.util.Scanner;

/*  Создать приложение с использованием рекурсии для перевода целого числа,
    введенного с клавиатуры, в двоичную систему счисления. */

public class Task02_BinaryRecursion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое число: ");
        int number = scanner.nextInt();

        if (number == 0) {
            System.out.println("Двоичное представление: 0");
        } else {
            System.out.print("Двоичное представление: ");
            if (number < 0) {
                System.out.print("-");
                number = Math.abs(number);
            }
            toBinary(number);
            System.out.println();
        }
    }

    public static void toBinary(int n) {
        if (n == 0) {
            return;
        }

        toBinary(n / 2);
        System.out.print(n % 2);
    }
}