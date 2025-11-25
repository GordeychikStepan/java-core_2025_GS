package LW5.Task2;

public class CharRange {
    private final char start;
    private final char end;

    // Конструктор
    public CharRange(char start, char end) {
        this.start = start;
        this.end = end;
    }

    // Метод без аргументов, возвращает строку с символами
    public String getRangeAndPrint() {
        StringBuilder sb = new StringBuilder();

        // определяем направление
        char from = (char) Math.min(start, end);
        char to   = (char) Math.max(start, end);

        for (char c = from; c <= to; c++) {
            sb.append(c).append(" ");
        }

        // вывод в консоль
        System.out.println(sb.toString());

        // возвращаем строку как результат
        return sb.toString();
    }
}
