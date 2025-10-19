package LW2;

import java.util.Scanner;

/*  Напишите программу, которая проверяет, попадает ли введение
    пользователем число в диапазон от 5 до 10 включительно. */

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите число: ");
        int num = sc.nextInt();

        System.out.println(((num >= 5) && (num <= 10)) ?
                ("Число входит в диапазон от 5 до 10 включительно.") :
                ("Число не входит в диапазон от 5 до 10 включительно."));

        sc.close();
    }
}
