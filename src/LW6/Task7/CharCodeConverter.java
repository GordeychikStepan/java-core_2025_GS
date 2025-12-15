package LW6.Task7;

public class CharCodeConverter {

    // Статический метод: char[] -> int[] (коды символов)
    public static int[] toCharCodes(char[] chars) {
        if (chars == null) {
            throw new IllegalArgumentException("Символьный массив равен null");
        }

        int[] codes = new int[chars.length];

        for (int i = 0; i < chars.length; i++) {
            codes[i] = chars[i]; // неявное приведение char -> int
        }

        return codes;
    }
}
