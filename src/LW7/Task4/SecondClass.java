package LW7.Task4;

public class SecondClass extends FirstClass {

    // открытое текстовое поле
    public String text;

    // конструктор с параметрами
    public SecondClass(char ch, String text) {
        super(ch);
        this.text = text;
    }

    // конструктор копирования
    public SecondClass(SecondClass other) {
        super(other);
        this.text = other.text;
    }
}
