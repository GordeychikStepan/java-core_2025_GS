package LW12.Tasks;

/*  Напишите программу, которая создает 10 потоков
    и каждый поток выводит на экран свой номер. */

public class Task04_TenThreads {
    public static void main(String[] args) throws InterruptedException {
        Thread[] threads = new Thread[10];

        for (int i = 0; i < threads.length; i++) {
            int threadNumber = i + 1;
            threads[i] = new Thread(() ->
                    System.out.println("Номер потока: " + threadNumber),
                    "Thread-" + threadNumber);
            threads[i].start();
        }

        for (Thread thread : threads) {
            thread.join();
        }

        System.out.println("Все потоки завершили работу");
    }
}
