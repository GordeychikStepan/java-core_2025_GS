package LW2;

import java.util.Scanner;

/*  Напишите программу, которая проверяет, сколько тысяч во введенном
    пользователем числе (определяется четвертая цифра справа в десятичном
    представлении числа). */

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите число: ");
        int num = sc.nextInt();

        int thousandNum = (num / 1000) % 10;
        System.out.println("Количество тысяч: " + thousandNum);

        sc.close();
    }
}
