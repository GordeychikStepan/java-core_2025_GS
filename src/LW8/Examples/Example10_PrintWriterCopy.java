package LW8.Examples;

import LW8.IoPaths;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Path;

public class Example10_PrintWriterCopy {

    private static final Charset CP1251 = Charset.forName("windows-1251");

    public static void main(String[] args) {
        Path src = IoPaths.file("example10_in.txt");
        Path dst = IoPaths.file("example10_out.txt");

        // Подготовка исходника
        try (Writer w = new OutputStreamWriter(new FileOutputStream(src.toFile()), CP1251)) {
            w.write("Первая строка\n");
            w.write("Вторая строка\n");
        } catch (IOException e) {
            System.out.println("Ошибка подготовки: " + e);
            return;
        }

        BufferedReader br = null;
        PrintWriter out = null;

        try {
            br = new BufferedReader(new InputStreamReader(new FileInputStream(src.toFile()), CP1251));
            out = new PrintWriter(dst.toFile(), CP1251.name());

            int lineCount = 0;
            String s;
            while ((s = br.readLine()) != null) {
                lineCount++;
                out.println(lineCount + ": " + s);
            }

            // Дополнительно: быстрый вывод на консоль
            PrintWriter console = new PrintWriter(System.out, true);
            console.println("Скопировано строк: " + lineCount);

        } catch (IOException e) {
            System.out.println("Ошибка: " + e);
        } finally {
            try { if (br != null) br.close(); } catch (IOException ignored) {}
            if (out != null) {
                out.flush();
                out.close();
            }
        }

        System.out.println("dst: " + dst.toAbsolutePath());
    }
}
