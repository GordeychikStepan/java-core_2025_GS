package LW2;

import java.util.Scanner;

/*  Напишите программу, которая проверяет, удовлетворяет ли введенное
    пользователем число следующим критериям: при делении на 5 в остатке
    получается 2, а при делении на 7 в остатке получается 1 */

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите число: ");
        int num = sc.nextInt();

        System.out.println(((num % 5 == 2) && (num % 7 == 1)) ?
                ("Число удовлетворяет условиям.") :
                ("Число не удовлетворяет условиям."));

        sc.close();
    }
}
