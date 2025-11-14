package LW4;

/*  7.	Напишите программу, в которой создается двумерный числовой массив и этот массив заполняется «змейкой»:
    сначала первая строка (слева направо), затем последний столбец (сверху вниз),
    вторая строка (справа налево) и так далее, как показано на рисунке */

public class Task7 {
    public static void main(String[] args) {

        int rows = 7;   // количество строк
        int cols = 7;   // количество столбцов

        int[][] array = new int[rows][cols];

        int value = 1;  // число, которым заполняем массив

        // заполняем массив "змейкой"
        for (int i = 0; i < rows; i++) {
            if (i % 2 == 0) {
                // чётная строка: слева направо
                for (int j = 0; j < cols; j++) {
                    array[i][j] = value++;
                }
            } else {
                // нечётная строка: справа налево
                for (int j = cols - 1; j >= 0; j--) {
                    array[i][j] = value++;
                }
            }
        }

        // вывод массива
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("%3d", array[i][j]);
            }
            System.out.println();
        }
    }
}
