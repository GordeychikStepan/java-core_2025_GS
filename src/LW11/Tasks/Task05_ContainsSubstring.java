package LW11.Tasks;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*  Напишите функцию, которая принимает на вход список строк и возвращает новый список,
    содержащий только те строки, которые содержат заданную подстроку. */

public class Task05_ContainsSubstring {
    public static List<String> getStringsContainingSubstring(List<String> lines, String substring) {
        return lines.stream()
                .filter(line -> line.contains(substring))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> lines = Arrays.asList("functional", "stream", "team", "dream", "java", "extreme");
        String substring = "eam";

        System.out.println("Исходный список: " + lines);
        System.out.println("Подстрока: " + substring);
        System.out.println("Результат: " + getStringsContainingSubstring(lines, substring));
    }
}
