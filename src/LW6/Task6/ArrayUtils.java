package LW6.Task6;

import java.util.Arrays;

public class ArrayUtils {

    // Статический метод: взять первые n элементов массива
    public static int[] takeFirst(int[] source, int count) {
        if (source == null) {
            throw new IllegalArgumentException("Исходный массив равен null");
        }

        if (count <= 0) {
            return new int[0]; // пустой массив
        }

        if (count >= source.length) {
            // вернуть копию исходного массива
            return Arrays.copyOf(source, source.length);
        }

        // взять первые count элементов
        return Arrays.copyOf(source, count);
    }
}
