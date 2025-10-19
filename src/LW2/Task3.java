package LW2;

import java.util.Scanner;

/*  Напишите программу, которая проверяет, удовлетворяет ли введенное
    пользователем число следующим критериям: число делится на 4, и при
    этом оно не меньше 10 */

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите число: ");
        int num = sc.nextInt();


        System.out.println(((num % 4 == 0) && (num >= 10)) ?
                ("Число удовлетворяет условиям.") :
                ("Число не удовлетворяет условиям."));

        sc.close();
    }
}
