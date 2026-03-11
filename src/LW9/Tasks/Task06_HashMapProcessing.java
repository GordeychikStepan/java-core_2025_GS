package LW9.Tasks;

import java.util.HashMap;
import java.util.Map;

/*  Заполнить HashMap 10 объектами <Integer, String>.
    Найти строки у которых ключ > 5. Если ключ = 0, вывести строки через запятую.
    Перемножить все ключи, где длина строки > 5. */

public class Task06_HashMapProcessing {

    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(0, "ноль");
        map.put(1, "один");
        map.put(2, "два");
        map.put(3, "три");
        map.put(4, "четыре");
        map.put(5, "пять");
        map.put(6, "шесть");
        map.put(7, "семь");
        map.put(8, "восемь");
        map.put(9, "девять");

        System.out.println("Строки, у которых ключ > 5:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getKey() > 5) {
                System.out.println(entry.getValue());
            }
        }

        System.out.print("\nСтроки, у которых ключ = 0: ");
        boolean first = true;
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getKey() == 0) {
                if (!first) {
                    System.out.print(", ");
                }
                System.out.print(entry.getValue());
                first = false;
            }
        }
        System.out.println();

        long product = 1;
        boolean found = false;

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getValue().length() > 5) {
                product *= entry.getKey();
                found = true;
            }
        }

        if (found) {
            System.out.println("\nПроизведение ключей, у которых длина строки > 5: " + product);
        } else {
            System.out.println("\nНет строк длиной более 5 символов.");
        }
    }
}