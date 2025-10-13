package LW1;

import java.time.Year;
import java.util.Scanner;

/*  Напишите программу, в которой по возрасту определяется год рождения. */

public class Task7 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите ваш возраст: ");
        int yearOfBirth = Year.now().getValue() - scanner.nextInt();

        System.out.print("Вероятно, вы родились в " + yearOfBirth + " году.");

        scanner.close();
    }
}
