package LW8.Examples;

import LW8.IoPaths;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Example07_BufferedLineCopy {

    public static void main(String[] args) {
        File src = IoPaths.file("example7_in.txt").toFile();
        File dst = IoPaths.file("example7_out.txt").toFile();

        // Подготовим исходник
        try (Writer w = new OutputStreamWriter(new FileOutputStream(src), StandardCharsets.UTF_8)) {
            w.write("Первая строка\n");
            w.write("Вторая строка\n");
            w.write("Третья строка\n");
        } catch (IOException e) {
            System.out.println("Ошибка подготовки: " + e);
            return;
        }

        try (BufferedReader br = new BufferedReader(new FileReader(src), 1024);
             BufferedWriter bw = new BufferedWriter(new FileWriter(dst), 1024)) {

            String line;
            int lineCount = 0;
            while ((line = br.readLine()) != null) {
                lineCount++;
                String outLine = lineCount + ": " + line;
                System.out.println(outLine);

                bw.write(outLine);
                bw.newLine();
            }
            bw.flush();

        } catch (IOException e) {
            System.out.println("Ошибка: " + e);
        }

        System.out.println("dst: " + dst.getAbsolutePath());
    }
}
