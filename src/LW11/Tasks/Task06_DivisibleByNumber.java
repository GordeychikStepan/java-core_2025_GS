package LW11.Tasks;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*  Напишите функцию, которая принимает на вход список целых чисел и возвращает новый список,
    содержащий только те числа, которые делятся на заданное число без остатка. */

public class Task06_DivisibleByNumber {
    public static List<Integer> getNumbersDivisibleBy(List<Integer> numbers, int divisor) {
        return numbers.stream()
                .filter(number -> number % divisor == 0)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 12, 15, 18, 20, 21, 24, 30);
        int divisor = 3;

        System.out.println("Исходный список: " + numbers);
        System.out.println("Делитель: " + divisor);
        System.out.println("Результат: " + getNumbersDivisibleBy(numbers, divisor));
    }
}
