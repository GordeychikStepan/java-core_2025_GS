package LW7.Task4;

public class ThirdClass extends SecondClass {

    // открытое целочисленное поле
    public int number;

    // конструктор с параметрами
    public ThirdClass(char ch, String text, int number) {
        super(ch, text);
        this.number = number;
    }

    // конструктор копирования
    public ThirdClass(ThirdClass other) {
        super(other);
        this.number = other.number;
    }
}
