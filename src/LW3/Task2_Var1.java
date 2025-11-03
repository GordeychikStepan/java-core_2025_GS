package LW3;

import java.util.Scanner;

/*  Напишите программу, в которой пользователю предлагается
    ввести название дня недели. По введенному названию программа определяет
    порядковый номер дня в неделе. Если пользователь вводит неправильное
    название дня, программа выводит сообщение о том, что такого дня нет.
    Предложите версию программы на основе вложенных условных операторов и
    на основе оператора выбора switch. */

public class Task2_Var1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите день недели: ");
        String day = sc.nextLine().toLowerCase();

        sc.close();

        // На основе вложенных условных операторов
        if (day.equals("понедельник")) {
            System.out.println("1");
        } else if (day.equals("вторник")) {
            System.out.println("2");
        } else if (day.equals("среда")) {
            System.out.println("3");
        } else if (day.equals("четверг")) {
            System.out.println("4");
        } else if (day.equals("пятница")) {
            System.out.println("5");
        } else if (day.equals("суббота")) {
            System.out.println("6");
        } else if (day.equals("воскресенье")) {
            System.out.println("7");
        } else {
            System.out.println("Такого дня нет!");
        }

        sc.close();
    }
}
