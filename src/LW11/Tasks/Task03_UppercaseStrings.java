package LW11.Tasks;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*  Напишите функцию, которая принимает на вход список строк и возвращает новый список,
    содержащий только те строки, которые начинаются с большой буквы. */

public class Task03_UppercaseStrings {
    public static List<String> getStringsStartingWithUppercase(List<String> lines) {
        return lines.stream()
                .filter(line -> !line.isEmpty())
                .filter(line -> Character.isUpperCase(line.charAt(0)))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> lines = Arrays.asList("Apple", "banana", "Cherry", "dog", "Екатеринбург", "город");
        System.out.println("Исходный список: " + lines);
        System.out.println("Результат: " + getStringsStartingWithUppercase(lines));
    }
}
