package LW7.Task3;

public class ThirdClass extends SecondClass {

    // открытое текстовое поле
    public String text;

    // конструктор с тремя параметрами
    public ThirdClass(int num, char ch, String text) {
        super(num, ch);
        this.text = text;
    }

    // метод с тремя параметрами (перегрузка метода из суперкласса)
    public void setValue(int num, char ch, String text) {
        this.num = num;
        this.ch = ch;
        this.text = text;
    }

    @Override
    public String toString() {
        return "Class name: " + this.getClass().getSimpleName() + "\n" +
                "num = " + num + "\n" +
                "ch = " + ch + "\n" +
                "text = " + text;
    }
}
