package LW1;

import java.util.Scanner;

/*  Напишите программу, в которой пользователю предлагается ввести название месяца и количество дней в этом месяце.
    Программа выводит сообщение о том, что соответствующий месяц содержит указанное количество дней. */

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите месяц: ");
        String month = scanner.nextLine();

        System.out.print("Введите количество дней в месяце " + month + ": ");
        int monthDays = scanner.nextInt();

        System.out.println("\nМесяц " + month + " содержит " + monthDays + " дн..");

        scanner.close();
    }
}
