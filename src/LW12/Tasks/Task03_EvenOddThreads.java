package LW12.Tasks;

/*  Напишите программу, которая создает два потока, которые выводят на экран
    числа от 1 до 10. Первый поток должен выводить только четные числа,
    а второй поток должен выводить только нечетные числа. */

public class Task03_EvenOddThreads {
    private static final Object lock = new Object();
    private static int currentNumber = 1;

    public static void main(String[] args) throws InterruptedException {
        Thread evenThread = new Thread(() -> printNumbers(true), "Поток четных чисел");
        Thread oddThread = new Thread(() -> printNumbers(false), "Поток нечетных чисел");

        oddThread.start();
        evenThread.start();

        oddThread.join();
        evenThread.join();
    }

    private static void printNumbers(boolean even) {
        while (true) {
            synchronized (lock) {
                while (currentNumber <= 10 && currentNumber % 2 == 0 != even) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                }

                if (currentNumber > 10) {
                    lock.notifyAll();
                    return;
                }

                System.out.println(Thread.currentThread().getName()
                        + " вывел число: " + currentNumber);
                currentNumber++;
                lock.notifyAll();
            }
        }
    }
}
