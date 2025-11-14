package LW4;

/*  1.	Напишите программу, которая выводить в консольное окно прямоугольник,
    размеры сторон которого, ширина: 23 колонки, высота: 11 строк; */

public class Task1 {
    public static void main(String[] args) {
        int width = 23;
        int height = 11;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("+");
            }
            System.out.println();
        }
    }
}
