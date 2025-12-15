package LW6.Task9;

public class CharArrayUtils {

    // Статический метод: попарная перестановка элементов массива
    public static void reversePairs(char[] array) {
        if (array == null) {
            throw new IllegalArgumentException("Массив равен null");
        }

        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            char temp = array[left];
            array[left] = array[right];
            array[right] = temp;

            left++;
            right--;
        }
    }
}
