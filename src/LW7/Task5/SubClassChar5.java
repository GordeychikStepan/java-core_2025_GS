package LW7.Task5;

public class SubClassChar5 extends SuperClass5 {

    // защищённое символьное поле
    protected char ch;

    // конструктор с двумя параметрами
    public SubClassChar5(String text, char ch) {
        super(text);
        this.ch = ch;
    }

    // переопределённый метод отображения
    @Override
    public void show() {
        System.out.println("Class name: " + this.getClass().getSimpleName() +
                ", text = " + getText() +
                ", ch = " + ch);
    }
}
