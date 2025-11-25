package LW5.Task4;

public class CharIntClass {
    private final char symbol;
    private final int number;

    // Конструктор с двумя аргументами
    public CharIntClass(int number, char symbol) {
        this.number = number;
        this.symbol = symbol;
    }

    // Конструктор с одним аргументом типа double
    public CharIntClass(double value) {
        // целая часть — код символа
        int intPart = (int) value;
        this.symbol = (char) intPart;

        // дробная часть → берем десятые и сотые
        double fractional = value - intPart;     // например, 0.1267

        this.number = (int) (fractional * 100);  // 12 (1267 * 0.01)
    }

    public void printInfo() {
        System.out.println("Символ: " + symbol);
        System.out.println("Число: " + number);
    }
}
