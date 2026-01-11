package LW8.Tasks;

import LW8.IoPaths;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.Arrays;

/*  Создать проект, позволяющий из одного, предварительно созданного программными средствами файла,
    переписать данные, соответствующие условию - в исходном файле содержится две строки в формате UTF-8
    и 5 чисел типа double. В результирующий файл переписать вторую строку и положительные числа. */

public class Task02_FilterSecondStringAndPositiveDoubles {

    public static void main(String[] args) {
        Path src = IoPaths.file("task2_source.bin");
        Path dst = IoPaths.file("task2_result.txt");

        String line1 = "Первая строка (UTF-8)";
        String line2 = "Вторая строка (UTF-8) — её надо переписать";
        double[] nums = new double[] { 10.5, -3.2, 0.0, 7.77, -1.0 };

        // 1) Создаём исходный файл (бинарный): 2 строки + 5 double
        try (DataOutputStream out = new DataOutputStream(new FileOutputStream(src.toFile()))) {
            out.writeUTF(line1);
            out.writeUTF(line2);
            for (double x : nums) out.writeDouble(x);
            out.flush();
        } catch (IOException e) {
            System.out.println("Ошибка записи src: " + e);
            return;
        }

        // 2) Читаем, фильтруем и пишем в результирующий (текстовый UTF-8)
        try (DataInputStream in = new DataInputStream(new FileInputStream(src.toFile()));
             BufferedWriter w = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(dst.toFile()), StandardCharsets.UTF_8))) {

            String a = in.readUTF(); // первая строка (не нужна)
            String b = in.readUTF(); // вторая строка (нужна)

            w.write("Вторая строка:");
            w.newLine();
            w.write(b);
            w.newLine();
            w.newLine();

            w.write("Положительные числа:");
            w.newLine();

            int total = 5;
            int positiveCount = 0;
            for (int i = 0; i < total; i++) {
                double x = in.readDouble();
                if (x > 0) {
                    positiveCount++;
                    w.write(Double.toString(x));
                    w.newLine();
                }
            }

            w.newLine();
            w.write("Всего чисел: " + total + ", положительных: " + positiveCount);
            w.newLine();

            w.flush();

            System.out.println("OK. Исходный: " + src.toAbsolutePath());
            System.out.println("OK. Результат: " + dst.toAbsolutePath());
            System.out.println("Было чисел: " + Arrays.toString(nums));

        } catch (IOException e) {
            System.out.println("Ошибка обработки: " + e);
        }
    }
}
