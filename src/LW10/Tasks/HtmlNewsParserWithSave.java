package LW10.Tasks;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class HtmlNewsParserWithSave {
    private static final String URL = "http://fat.urfu.ru/index.html";
    private static final String OUTPUT_FILE = "src/LW10/Tasks/news.txt";

    public static void main(String[] args) {
        int maxAttempts = 3;
        int attempt = 1;

        while (attempt <= maxAttempts) {
            try {
                parseAndSaveNews();
                System.out.println("Данные успешно сохранены в файл " + OUTPUT_FILE);
                return;
            } catch (IOException e) {
                System.out.println("Ошибка при получении HTML-кода страницы. Попытка " + attempt + " из " + maxAttempts);
                System.out.println("Текст ошибки: " + e.getMessage());
                attempt++;

                if (attempt <= maxAttempts) {
                    System.out.println("Повторное подключение к сайту...\n");
                } else {
                    System.out.println("Не удалось получить данные после нескольких попыток.");
                }
            }
        }
    }

    private static void parseAndSaveNews() throws IOException {
        Document doc = Jsoup.connect(URL).get();
        Elements newsParent = doc.select(
                "body > table > tbody > tr > td > div > table > " +
                "tbody > tr:nth-child(5) > td:nth-child(3) > table > tbody > " +
                "tr > td:nth-child(7)"
        );

        try (FileWriter writer = new FileWriter(OUTPUT_FILE)) {
            for (int i = 3; i < 20; i++) {
                if (i % 2 == 0) {
                    List<Node> nodes = newsParent.get(0).childNodes();

                    String title = ((Element) nodes.get(i))
                            .getElementsByClass("blocktitle")
                            .get(0).childNodes().get(0).toString();

                    String date = ((Element) nodes.get(i))
                            .getElementsByClass("blockdate")
                            .get(0).childNodes().get(0).toString();

                    String text = "Тема: " + title + System.lineSeparator()
                            + "Дата: " + date + System.lineSeparator() + System.lineSeparator();

                    System.out.print(text);
                    writer.write(text);
                }
            }
        }
    }
}
