package LW12.Examples;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Example1 {
    public static void main(String[] args) throws InterruptedException {
        Runnable task = () -> {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
            long endTime = System.currentTimeMillis() + 10_000;

            while (System.currentTimeMillis() < endTime) {
                System.out.println(Thread.currentThread().getName()
                        + " - текущее время: "
                        + LocalTime.now().format(formatter));

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    return;
                }
            }
        };

        Thread t1 = new Thread(task, "Поток 1");
        Thread t2 = new Thread(task, "Поток 2");

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Работа потоков завершена");
    }
}
