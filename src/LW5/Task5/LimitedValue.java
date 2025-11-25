package LW5.Task5;

public class LimitedValue {
    private int value;

    // Конструктор без аргументов
    public LimitedValue() {
        this.value = 0;
    }

    // Конструктор с аргументом
    public LimitedValue(int value) {
        this.value = Math.min(value, 100);
    }

    // Метод без аргументов — установить 0
    public void setValue() {
        this.value = 0;
    }

    // Метод с аргументом — установить значение
    public void setValue(int value) {
        this.value = Math.min(value, 100);
    }

    // Вывод
    public void printValue() {
        System.out.println("Значение поля: " + value);
    }
}
