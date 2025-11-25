package LW5.Task1;

public class SymbolClass {
    // Закрытое символьное поле
    private char symbol;

    // Метод для присвоения значения полю
    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    // Метод, возвращающий код символа
    public int getSymbolCode() {
        return (int)symbol;
    }

    // Метод, выводящий символ и его код
    public void printSymbolInfo() {
        System.out.println("Символ: " + symbol);
        System.out.println("Код символа: " + (int) symbol);
    }
}
