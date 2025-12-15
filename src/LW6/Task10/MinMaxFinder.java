package LW6.Task10;

public class MinMaxFinder {

    // Статический метод: поиск минимума и максимума
    public static int[] findMinMax(int... values) {
        if (values == null || values.length == 0) {
            throw new IllegalArgumentException("Аргументы не переданы");
        }

        int min = values[0];
        int max = values[0];

        for (int v : values) {
            if (v < min) {
                min = v;
            }
            if (v > max) {
                max = v;
            }
        }

        return new int[]{max, min};
    }
}
