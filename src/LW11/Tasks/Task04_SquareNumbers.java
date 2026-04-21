package LW11.Tasks;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*  Напишите функцию, которая принимает на вход список чисел и возвращает новый список,
    содержащий квадраты этих чисел. */

public class Task04_SquareNumbers {
    public static List<Integer> getSquares(List<Integer> numbers) {
        return numbers.stream()
                .map(number -> number * number)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 5, 7, 9);
        System.out.println("Исходный список: " + numbers);
        System.out.println("Результат: " + getSquares(numbers));
    }
}
