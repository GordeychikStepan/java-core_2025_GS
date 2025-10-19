package LW2;

import java.util.Scanner;

/*  Напишите программу, которая проверяет, делится ли введенное
    Пользователем число на 3 */

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите число: ");
        int num = sc.nextInt();

        System.out.println(num % 3 == 0 ? ("Число " + num + " делится на 3") : ("Число " + num + " не делится на 3"));

        sc.close();
    }
}
