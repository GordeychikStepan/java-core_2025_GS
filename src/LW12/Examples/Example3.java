package LW12.Examples;

public class Example3 {
    private static final Object lock = new Object();
    private static int number = 1;

    public static void main(String[] args) throws InterruptedException {
        Thread evenThread = new Thread(() -> printNumbers(true), "Четный поток");
        Thread oddThread = new Thread(() -> printNumbers(false), "Нечетный поток");

        evenThread.start();
        oddThread.start();

        evenThread.join();
        oddThread.join();
    }

    private static void printNumbers(boolean even) {
        while (true) {
            synchronized (lock) {
                while (number <= 10 && number % 2 == 0 != even) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                }

                if (number > 10) {
                    lock.notifyAll();
                    return;
                }

                System.out.println(Thread.currentThread().getName() + ": " + number);
                number++;
                lock.notifyAll();
            }
        }
    }
}
