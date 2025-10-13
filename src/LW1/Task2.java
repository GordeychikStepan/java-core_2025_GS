package LW1;

import java.util.Scanner;

/*  Напишите программу, в которой Пользователь вводит имя и возраст.
    Программа отображает сообщение об имени и возрасте пользователя. */

public class Task2 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите имя: ");
        String name = scanner.nextLine();

        System.out.print("Введите возраст: ");
        int age = scanner.nextInt();

        System.out.println("\nВаше имя: " + name + "\nВаш возраст: " + age);

        scanner.close();
    }
}
