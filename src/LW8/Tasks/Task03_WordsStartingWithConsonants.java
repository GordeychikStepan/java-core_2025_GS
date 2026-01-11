package LW8.Tasks;

import LW8.IoPaths;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;

/*  Создать проект, позволяющий из одного текстового файла, содержащего несколько строк (тип String)
    заранее подготовленного текста на русском языке (Пушкин, Лермонтов или другой российский классик на Ваш вкус),
    построчно переписать в другой текстовый файл слова начинающиеся с согласных букв.
    Требования:
    – слова из предложения выделять методом split();
    – в новом файле следует указать номер строки, в которой искомые слова находились в исходном файле;
    – для каждой строки указать количество выбранных слов. */

public class Task03_WordsStartingWithConsonants {

    // Русские согласные (нижний регистр) + Ё отдельно обработаем
    private static final String CONSONANTS = "бвгджзйклмнпрстфхцчшщ";

    private static boolean startsWithRussianConsonant(String word) {
        if (word == null || word.isEmpty()) return false;

        char c = word.charAt(0);
        // Нормализуем к нижнему регистру
        c = Character.toLowerCase(c);

        // Отсекаем не-русские буквы
        if (!(c >= 'а' && c <= 'я') && c != 'ё') return false;

        // гласные: а е ё и о у ы э ю я
        // значит согласные = русские - гласные
        return CONSONANTS.indexOf(c) >= 0;
    }

    public static void main(String[] args) {
        Path src = IoPaths.file("task3_poem.txt");
        Path dst = IoPaths.file("task3_result.txt");

        // Если файла нет — создадим заготовку (чтобы можно было сразу запустить)
        if (!src.toFile().exists()) {
            try (BufferedWriter w = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(src.toFile()), StandardCharsets.UTF_8))) {
                w.write("Мороз и солнце; день чудесный!\n");
                w.write("Еще ты дремлешь, друг прелестный —\n");
                w.write("Пора, красавица, проснись:\n");
                w.flush();
            } catch (IOException e) {
                System.out.println("Не удалось создать исходный текст: " + e);
                return;
            }
        }

        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(src.toFile()), StandardCharsets.UTF_8));
             PrintWriter out = new PrintWriter(new OutputStreamWriter(new FileOutputStream(dst.toFile()), StandardCharsets.UTF_8), true)) {

            String line;
            int lineNo = 0;

            while ((line = br.readLine()) != null) {
                lineNo++;

                // split() по НЕ-буквам (оставляем только слова)
                String[] words = line.split("[^А-Яа-яЁё]+");

                int count = 0;
                StringBuilder picked = new StringBuilder();

                for (String w : words) {
                    if (w == null || w.isEmpty()) continue;
                    if (startsWithRussianConsonant(w)) {
                        count++;
                        if (picked.length() > 0) picked.append(", ");
                        picked.append(w);
                    }
                }

                out.println("Строка " + lineNo + " | найдено слов: " + count);
                if (count > 0) {
                    out.println(picked);
                }
                out.println();
            }

            System.out.println("OK. Исходный: " + src.toAbsolutePath());
            System.out.println("OK. Результат: " + dst.toAbsolutePath());

        } catch (IOException e) {
            System.out.println("Ошибка: " + e);
        }
    }
}
