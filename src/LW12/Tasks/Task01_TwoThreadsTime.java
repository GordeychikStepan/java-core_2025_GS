package LW12.Tasks;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/*  Напишите программу, которая запускает два потока и выводит на экран
    их имена и текущее время в течение 10 секунд. */

public class Task01_TwoThreadsTime {
    public static void main(String[] args) throws InterruptedException {
        Runnable printTimeTask = () -> {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
            long finishTime = System.currentTimeMillis() + 10_000;

            while (System.currentTimeMillis() < finishTime) {
                System.out.println(Thread.currentThread().getName()
                        + " - " + LocalTime.now().format(formatter));

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    return;
                }
            }
        };

        Thread firstThread = new Thread(printTimeTask, "Первый поток");
        Thread secondThread = new Thread(printTimeTask, "Второй поток");

        firstThread.start();
        secondThread.start();

        firstThread.join();
        secondThread.join();

        System.out.println("Программа завершена");
    }
}
