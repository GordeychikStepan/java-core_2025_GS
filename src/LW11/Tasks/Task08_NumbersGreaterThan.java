package LW11.Tasks;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*  Напишите функцию, которая принимает на вход список целых чисел и возвращает новый список,
    содержащий только те числа, которые больше заданного значения. */

public class Task08_NumbersGreaterThan {
    public static List<Integer> getNumbersGreaterThan(List<Integer> numbers, int limit) {
        return numbers.stream()
                .filter(number -> number > limit)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(4, 9, 12, 17, 20, 3, 25, 11);
        int limit = 10;

        System.out.println("Исходный список: " + numbers);
        System.out.println("Порог: " + limit);
        System.out.println("Результат: " + getNumbersGreaterThan(numbers, limit));
    }
}
