package LW4;

/*  2.	Напишите программу, которая выводит в консольное окно прямоугольный треугольник */

public class Task2 {
    public static void main(String[] args) {
        int height = 10;

        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("+");
            }
            System.out.println();
        }
    }
}
