package LW6.Task7;

/*  Напишите программу со статическим методом, аргументом которому передастся
    символьный массив, а результатом возвращается ссылка на целочисленным массив,
    состоящий из кодов символов из массива- аргумента. */

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        char[] symbols = {'A', 'я', '1', '?'};

        int[] codes = CharCodeConverter.toCharCodes(symbols);

        System.out.println("Символы: " + Arrays.toString(symbols));
        System.out.println("Коды: " + Arrays.toString(codes));
    }
}
