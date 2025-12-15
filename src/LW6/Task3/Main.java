package LW6.Task3;

/*  Напишите программу с классом, в котором есть статические методы, которым можно передавать
    произвольное количество целочисленных аргументов (или целочисленный массив).
    Методы, на основании переданных аргументов или массива, позволяют вычислить:
    наибольшее значение, наименьшее значение, а также среднее значение из набора чисел. */

public class Main {
    public static void main(String[] args) {

        System.out.println("Максимум: " + NumberUtils.max(3, 7, 2, 9, 4));
        System.out.println("Минимум: " + NumberUtils.min(3, 7, 2, 9, 4));
        System.out.println("Среднее: " + NumberUtils.average(3, 7, 2, 9, 4));

        int[] arr = {10, 20, 30, 40};
        System.out.println("Максимум (массив): " + NumberUtils.max(arr));
        System.out.println("Минимум (массив): " + NumberUtils.min(arr));
        System.out.println("Среднее (массив): " + NumberUtils.average(arr));
    }
}
