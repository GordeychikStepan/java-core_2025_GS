package LW11.Tasks;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*  Напишите функцию, которая принимает на вход список целых чисел и возвращает новый список,
    содержащий только те числа, которые меньше заданного значения. */

public class Task10_NumbersLessThan {
    public static List<Integer> getNumbersLessThan(List<Integer> numbers, int limit) {
        return numbers.stream()
                .filter(number -> number < limit)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 12, 1, 19, 7, 30, 4, 16);
        int limit = 10;

        System.out.println("Исходный список: " + numbers);
        System.out.println("Порог: " + limit);
        System.out.println("Результат: " + getNumbersLessThan(numbers, limit));
    }
}
