package LW4;

import java.util.Random;

/*  6.	Напишите программу, в которой создается и инициализируется двумерный числовой массив.
    Затем из этого массива удаляется строка и столбец
    (создается новый массив, в котором по сравнению с исходным удалена одна строка и один столбец).
    Индекс удаляемой строки и индекс удаляемого столбца определяется с помощью генератора случайных чисел. */

public class Task6 {
    public static void main(String[] args) {

        int rows = 5;    // количество строк
        int cols = 6;    // количество столбцов

        int[][] array = new int[rows][cols];
        Random rnd = new Random();

        // Инициализация массива числами 0–9
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = rnd.nextInt(10);
            }
        }

        // Вывод исходного массива
        System.out.println("Исходный массив:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        // Случайная строка и столбец для удаления
        int removeRow = rnd.nextInt(rows);
        int removeCol = rnd.nextInt(cols);

        System.out.println("\nУдаляем строку: " + removeRow);
        System.out.println("Удаляем столбец: " + removeCol);

        // Новый массив после удаления
        int[][] newArray = new int[rows - 1][cols - 1];

        int newI = 0;
        for (int i = 0; i < rows; i++) {
            if (i == removeRow) continue; // пропускаем удаляемую строку

            int newJ = 0;
            for (int j = 0; j < cols; j++) {
                if (j == removeCol) continue; // пропускаем удаляемый столбец

                newArray[newI][newJ] = array[i][j];
                newJ++;
            }
            newI++;
        }

        // Вывод нового массива
        System.out.println("\nНовый массив:");
        for (int i = 0; i < rows - 1; i++) {
            for (int j = 0; j < cols - 1; j++) {
                System.out.print(newArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
