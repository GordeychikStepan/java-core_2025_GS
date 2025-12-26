package LW7.Task3;

public class SecondClass extends FirstClass {

    // открытое символьное поле
    public char ch;

    // конструктор с двумя параметрами
    public SecondClass(int num, char ch) {
        super(num);
        this.ch = ch;
    }

    // метод с двумя параметрами (перегрузка метода из суперкласса)
    public void setValue(int num, char ch) {
        this.num = num;
        this.ch = ch;
    }

    @Override
    public String toString() {
        return "Class name: " + this.getClass().getSimpleName() + "\n" +
                "num = " + num + "\n" +
                "ch = " + ch;
    }
}
