package LW6.Task9;

/*  Напишите программу со статическим методом, аргументом которому передается
    одномерный символьный массив. В результате вызова метода элементы массива
    попарно меняются местами: первый — с последним, второй — с предпоследним и так далее.*/

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        char[] symbols = {'A', 'B', 'C', 'D', 'E'};

        System.out.println("До:  " + Arrays.toString(symbols));

        CharArrayUtils.reversePairs(symbols);

        System.out.println("После: " + Arrays.toString(symbols));
    }
}
