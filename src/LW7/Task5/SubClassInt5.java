package LW7.Task5;

public class SubClassInt5 extends SuperClass5 {

    // защищённое целочисленное поле
    protected int number;

    // конструктор с двумя параметрами
    public SubClassInt5(String text, int number) {
        super(text);
        this.number = number;
    }

    // переопределённый метод отображения
    @Override
    public void show() {
        System.out.println("Class name: " + this.getClass().getSimpleName() +
                ", text = " + getText() +
                ", number = " + number);
    }
}
