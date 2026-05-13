package LW12.Tasks;

import java.util.Arrays;
import java.util.Random;

/*  Напишите функцию, которая находит максимальный элемент в массиве целых чисел
    при помощи многопоточности. Количество потоков должно быть равно количеству
    ядер процессора. */

public class Task05_MaxElementMultithread {

    public static int findMax(int[] array) throws InterruptedException {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Массив не должен быть пустым");
        }

        int processors = Runtime.getRuntime().availableProcessors();
        int threadCount = Math.min(processors, array.length);

        Thread[] threads = new Thread[threadCount];
        int[] localMaximums = new int[threadCount];

        for (int i = 0; i < threadCount; i++) {
            final int index = i;

            final int start = index * array.length / threadCount;
            final int end = (index + 1) * array.length / threadCount;

            threads[i] = new Thread(() -> {
                int max = array[start];

                for (int j = start + 1; j < end; j++) {
                    if (array[j] > max) {
                        max = array[j];
                    }
                }

                localMaximums[index] = max;
            });

            threads[i].start();
        }

        for (Thread thread : threads) {
            thread.join();
        }

        int result = localMaximums[0];

        for (int i = 1; i < localMaximums.length; i++) {
            if (localMaximums[i] > result) {
                result = localMaximums[i];
            }
        }

        return result;
    }

    public static void main(String[] args) throws InterruptedException {
        int[] numbers = new Random().ints(20, 1, 100).toArray();

        System.out.println("Массив: " + Arrays.toString(numbers));
        System.out.println("Количество ядер процессора: "
                + Runtime.getRuntime().availableProcessors());
        System.out.println("Максимальный элемент: " + findMax(numbers));
    }
}