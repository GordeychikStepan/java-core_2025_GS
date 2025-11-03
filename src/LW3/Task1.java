package LW3;

import java.util.Scanner;

/*  Напишите программу, в которой пользователь вводит целое число
    в диапазоне от 1 до 7, а программа определяет по этому числу день недели.
    Если введенное пользователем число выходит за допустимый диапазон,
    выводится сообщение о том, что введено некорректное значение. Используйте
    оператор выбора switch. */

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите число: ");
        int num = sc.nextInt();

        sc.close();

        switch (num) {
            case 1:
                System.out.print("Понедельник");
                break;
            case 2:
                System.out.print("Вторник");
                break;
            case 3:
                System.out.print("Среда");
                break;
            case 4:
                System.out.print("Четверг");
                break;
            case 5:
                System.out.print("Пятница");
                break;
            case 6:
                System.out.print("Суббота");
                break;
            case 7:
                System.out.print("Воскресенье");
                break;
            default:
                System.out.print("Введено некорректное значение.");
        }
    }
}
