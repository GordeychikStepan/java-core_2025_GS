package LW1;

import java.time.Year;
import java.util.Scanner;

/*  Напишите программу, в которой Пользователь вводит имя и год рождения,
    а программа отображает сообщение содержащее имя пользователя и его возраст. */

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите ваше имя: ");
        String name = scanner.nextLine();

        System.out.print("Введите ваш год рождения: ");
        int yearsOld = Year.now().getValue() - scanner.nextInt();


        System.out.println("\nВас зовут " + name + ", а ваш возраст - " + yearsOld + ".");

        scanner.close();
    }
}
