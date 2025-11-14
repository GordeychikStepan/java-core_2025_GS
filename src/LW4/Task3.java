package LW4;

/*  3.	Напишите программу, в которой создается двумерный массив, который выводит прямоугольник из цифр 2 */

public class Task3 {
    public static void main(String[] args) {

        int rows = 5;     // количество строк прямоугольника
        int cols = 10;    // количество столбцов прямоугольника

        int[][] array = new int[rows][cols];

        // заполняем массив двойками
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = 2;
            }
        }

        // выводим массив
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
