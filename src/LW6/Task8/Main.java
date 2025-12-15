package LW6.Task8;

/*  Напишите программу со статическим методом, аргументом которому передается
    целочисленный массив, а результатом возвращается среднее значение для элементов массива
    (сумма значений элементов, деленная на количество элементов в массиве). */

public class Main {
    public static void main(String[] args) {

        int[] numbers = {2, 4, 6, 8, 10};

        double avg = ArrayAverage.average(numbers);

        System.out.println("Среднее значение: " + avg);
    }
}
