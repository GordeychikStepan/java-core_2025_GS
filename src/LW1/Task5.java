package LW1;

import java.time.Year;
import java.util.Scanner;

/*  Напишите программу, в которой по году рождения определяется возраст пользователя. */

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите ваш год рождения: ");
        int yearOfBirth = scanner.nextInt();

        int yearNow = Year.now().getValue();

        System.out.println("Вероятно, вам сейчас " + (yearNow - yearOfBirth));

        scanner.close();
    }
}
