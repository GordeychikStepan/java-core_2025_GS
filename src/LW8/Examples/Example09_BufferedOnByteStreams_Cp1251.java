package LW8.Examples;

import LW8.IoPaths;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Path;

public class Example09_BufferedOnByteStreams_Cp1251 {

    private static final Charset CP1251 = Charset.forName("windows-1251");

    public static void main(String[] args) {
        Path src = IoPaths.file("example9_in.txt");
        Path dst = IoPaths.file("example9_out.txt");

        // Подготовка исходника
        try (Writer w = new OutputStreamWriter(new FileOutputStream(src.toFile()), CP1251)) {
            w.write("Строка 1 (cp1251)\n");
            w.write("Строка 2 (cp1251)\n");
        } catch (IOException e) {
            System.out.println("Ошибка подготовки: " + e);
            return;
        }

        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(new FileInputStream(src.toFile()), CP1251));
             BufferedWriter bw = new BufferedWriter(
                     new OutputStreamWriter(new FileOutputStream(dst.toFile()), CP1251))) {

            String s;
            int lineCount = 0;
            while ((s = br.readLine()) != null) {
                lineCount++;
                String out = lineCount + ": " + s;
                System.out.println(out);

                bw.write(out);
                bw.newLine();
            }
            bw.flush();

        } catch (IOException e) {
            System.out.println("Ошибка: " + e);
        }

        System.out.println("dst: " + dst.toAbsolutePath());
    }
}
