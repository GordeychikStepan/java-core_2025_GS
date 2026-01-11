package LW8.Examples;

import LW8.IoPaths;

import java.io.*;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class Example08_ByteToChar_ConvertCp1251 {

    private static final Charset CP1251 = Charset.forName("windows-1251");

    private static void readAllByChar(Reader in) throws IOException {
        int ch;
        while ((ch = in.read()) != -1) {
            System.out.print((char) ch);
        }
        System.out.println("\n--- конец ---\n");
    }

    public static void main(String[] args) {
        File f = IoPaths.file("example8_cp1251.txt").toFile();

        // Создадим файл (для надёжности пишем UTF-8, но читаем через cp1251 — чтобы увидеть разницу кодировок)
        try (Writer w = new OutputStreamWriter(new FileOutputStream(f), StandardCharsets.UTF_8)) {
            w.write("Текст с кириллицей: Привет, мир!\n");
        } catch (IOException e) {
            System.out.println("Ошибка подготовки: " + e);
            return;
        }

        try {
            System.out.println("=== 1) Файл через InputStreamReader(cp1251) ===");
            try (InputStream inFile = new FileInputStream(f);
                 Reader rFile = new InputStreamReader(inFile, CP1251)) {
                readAllByChar(rFile);
            }

            System.out.println("=== 2) URL через InputStreamReader(cp1251) (может не работать без интернета) ===");
            try (InputStream inUrl = new URL("https://example.com").openStream();
                 Reader rUrl = new InputStreamReader(inUrl, CP1251)) {
                readAllByChar(rUrl);
            } catch (IOException e) {
                System.out.println("URL недоступен: " + e);
                System.out.println("--- конец ---\n");
            }

            System.out.println("=== 3) byte[] через InputStreamReader(cp1251) ===");
            byte[] arr = new byte[]{5, 8, 3, 9, 11};
            try (InputStream inArr = new ByteArrayInputStream(arr);
                 Reader rArr = new InputStreamReader(inArr, CP1251)) {
                readAllByChar(rArr);
            }

        } catch (IOException e) {
            System.out.println("Ошибка: " + e);
        }
    }
}
