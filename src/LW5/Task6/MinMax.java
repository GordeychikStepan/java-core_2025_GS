package LW5.Task6;

public class MinMax {
    private int min;
    private int max;

    // Конструктор без аргументов (по умолчанию)
    public MinMax() {
        this.min = 0;
        this.max = 0;
    }

    // Конструктор с одним аргументом
    public MinMax(int a) {
        this.min = a;
        this.max = a;
    }

    // Конструктор с двумя аргументами
    public MinMax(int a, int b) {
        if (a > b) {
            this.max = a;
            this.min = b;
        } else {
            this.max = b;
            this.min = a;
        }
    }

    // Метод с одним аргументом
    public void setValue(int a) {
        int newMin = Math.min(Math.min(min, max), a);
        int newMax = Math.max(Math.max(min, max), a);

        this.min = newMin;
        this.max = newMax;
    }

    // Метод с двумя аргументами
    public void setValue(int a, int b) {
        int newMin = Math.min(Math.min(min, max), Math.min(a, b));
        int newMax = Math.max(Math.max(min, max), Math.max(a, b));

        this.min = newMin;
        this.max = newMax;
    }

    // Метод отображения значений
    public void printValues() {
        System.out.println("min = " + min + ", max = " + max);
    }
}
