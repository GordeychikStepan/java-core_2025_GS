package LW12.Tasks;

import java.util.Arrays;
import java.util.Random;

/*  Напишите функцию, которая суммирует элементы в массиве целых чисел
    при помощи многопоточности. Количество потоков должно быть равно количеству
    ядер процессора. */

public class Task06_SumArrayMultithread {
    public static long sumArray(int[] array) throws InterruptedException {
        if (array == null) {
            throw new IllegalArgumentException("Массив не должен быть null");
        }
        if (array.length == 0) {
            return 0;
        }

        int processors = Runtime.getRuntime().availableProcessors();
        int threadCount = Math.min(processors, array.length);
        Thread[] threads = new Thread[threadCount];
        long[] partialSums = new long[threadCount];
        int partSize = (int) Math.ceil((double) array.length / threadCount);

        for (int i = 0; i < threadCount; i++) {
            final int index = i;
            final int start = index * partSize;
            final int end = Math.min(start + partSize, array.length);

            threads[i] = new Thread(() -> {
                long sum = 0;
                for (int j = start; j < end; j++) {
                    sum += array[j];
                }
                partialSums[index] = sum;
            });
            threads[i].start();
        }

        for (Thread thread : threads) {
            thread.join();
        }

        long result = 0;
        for (long partialSum : partialSums) {
            result += partialSum;
        }
        return result;
    }

    public static void main(String[] args) throws InterruptedException {
        int[] numbers = new Random().ints(20, 1, 20).toArray();

        System.out.println("Массив: " + Arrays.toString(numbers));
        System.out.println("Количество ядер процессора: "
                + Runtime.getRuntime().availableProcessors());
        System.out.println("Сумма элементов массива: " + sumArray(numbers));
    }
}
