package LW7.Task4;

public class FirstClass {

    // открытое символьное поле
    public char ch;

    // конструктор с параметром
    public FirstClass(char ch) {
        this.ch = ch;
    }

    // конструктор копирования
    public FirstClass(FirstClass other) {
        this.ch = other.ch;
    }
}
