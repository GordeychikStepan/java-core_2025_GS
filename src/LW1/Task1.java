package LW1;

import java.util.Scanner;

/*  Напишите программу, в которой Пользователь вводит сначала фамилию, затем имя, затем отчество.
    После ввода программа выводит сообщение «Hello <фамилия, имя, отчество>». */

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите фамилию: ");
        String surname = scanner.nextLine();

        System.out.print("Введите имя: ");
        String name = scanner.nextLine();

        System.out.print("Введите отчество: ");
        String patronymic = scanner.nextLine();

        System.out.println("\nHello " + surname + ", " + name + ", " + patronymic);

        scanner.close();
    }
}
