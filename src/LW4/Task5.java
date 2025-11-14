package LW4;

import java.util.Random;

/*  5.	Напишите программу, в которой создается двумерный целочисленный массив.
    Он заполняется случайными числами. Затем в этом массиве строки и столбцы меняются местами:
    первая строка становится первым столбцом, вторая строка становиться вторым столбцом и так далее.
    Например, если исходный массив состоял из 3 строк и 5 столбцов,
    то в итоге получаем массив из 5 строк и 3 столбцов. */

public class Task5 {
    public static void main(String[] args) {

        int rows = 3;  // количество строк
        int cols = 5;  // количество столбцов

        int[][] array = new int[rows][cols];
        Random rnd = new Random();

        // заполнение массива случайными числами
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = rnd.nextInt(10); // числа 0–9
            }
        }

        // вывод исходного массива
        System.out.println("Исходный массив:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        // транспонирование массива (обмен строк и столбцов)
        int[][] transposed = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = array[i][j];
            }
        }

        // вывод нового массива
        System.out.println("\nТранспонированный массив:");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transposed[i][j] + " ");
            }
            System.out.println();
        }
    }
}
