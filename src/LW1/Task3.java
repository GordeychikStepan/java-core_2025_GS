package LW1;

import java.util.Scanner;

/*  Напишите программу, в которой Пользователь последовательно вводит название
    текущего дня недели, название месяца и дату (номер дня в месяце).
    Программа выводит сообщение о сегодняшней дате (день недели, дата, месяц). */

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите день недели: ");
        String dayOfWeek = scanner.nextLine();

        System.out.print("Введите месяц: ");
        String month = scanner.nextLine();

        System.out.print("Введите номер дня в месяце: ");
        int dayOfMonth = scanner.nextInt();

        System.out.println("\nСегодня: " + dayOfWeek + ", " + dayOfMonth + " " + month);

        scanner.close();
    }
}
