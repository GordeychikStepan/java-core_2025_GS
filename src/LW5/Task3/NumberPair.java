package LW5.Task3;

public class NumberPair {
    private final int a;
    private final int b;

    // Конструктор без аргументов
    public NumberPair() {
        this.a = 0;
        this.b = 0;
    }

    // Конструктор с одним аргументом
    public NumberPair(int a) {
        this.a = a;
        this.b = 0;
    }

    // Конструктор с двумя аргументами
    public NumberPair(int a, int b) {
        this.a = a;
        this.b = b;
    }

    // Метод для вывода значений
    public void printValues() {
        System.out.println("a = " + a + ", b = " + b);
    }
}
