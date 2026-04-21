package LW11.Tasks;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*  Напишите функцию, которая принимает на вход список строк и возвращает новый список,
    содержащий только те строки, которые содержат только буквы (без цифр и символов). */

public class Task09_LettersOnly {
    public static List<String> getStringsWithLettersOnly(List<String> lines) {
        return lines.stream()
                .filter(line -> line.matches("[\\p{L}]+"))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> lines = Arrays.asList("Java", "Code123", "Москва", "hello!", "Stream", "Тест");
        System.out.println("Исходный список: " + lines);
        System.out.println("Результат: " + getStringsWithLettersOnly(lines));
    }
}
