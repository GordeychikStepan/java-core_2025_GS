package LW7.Task3;

public class FirstClass {

    // открытое целочисленное поле
    public int num;

    // конструктор с одним параметром
    public FirstClass(int num) {
        this.num = num;
    }

    // метод с одним параметром (присваивание значению поля)
    public void setValue(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Class name: " + this.getClass().getSimpleName() + "\n" +
                "num = " + num;
    }
}
