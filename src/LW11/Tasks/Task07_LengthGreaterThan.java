package LW11.Tasks;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*  Напишите функцию, которая принимает на вход список строк и возвращает новый список,
    содержащий только те строки, которые имеют длину больше заданного значения. */

public class Task07_LengthGreaterThan {
    public static List<String> getStringsLongerThan(List<String> lines, int minLength) {
        return lines.stream()
                .filter(line -> line.length() > minLength)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> lines = Arrays.asList("cat", "stream", "java", "programming", "sun", "notebook");
        int minLength = 5;

        System.out.println("Исходный список: " + lines);
        System.out.println("Минимальная длина: " + minLength);
        System.out.println("Результат: " + getStringsLongerThan(lines, minLength));
    }
}
