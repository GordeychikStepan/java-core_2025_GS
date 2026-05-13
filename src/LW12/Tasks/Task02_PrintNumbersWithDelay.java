package LW12.Tasks;

/*  Напишите программу, которая запускает поток и выводит на экран
    числа от 1 до 10 с задержкой в 1 секунду между выводами. */

public class Task02_PrintNumbersWithDelay {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Число: " + i);

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    return;
                }
            }
        });

        thread.start();
        thread.join();
    }
}
