package LW4;

/*  4.	Напишите программу, в которой создается двумерный массив, который выводит прямоугольный треугольник */

public class Task4 {
    public static void main(String[] args) {

        int height = 10;
        int[][] array = new int[height][height];

        // заполняем массив: числа в строке увеличиваются от 1 до i
        for (int i = 0; i < height; i++) {
            for (int j = 0; j <= i; j++) {
                array[i][j] = 1;
            }
        }

        // выводим треугольник
        for (int i = 0; i < height; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
