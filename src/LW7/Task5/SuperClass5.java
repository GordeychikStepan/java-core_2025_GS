package LW7.Task5;

public class SuperClass5 {

    // приватное текстовое поле
    private String text;

    // конструктор с текстовым параметром
    public SuperClass5(String text) {
        this.text = text;
    }

    // доступ к приватному полю для наследников (через геттер)
    protected String getText() {
        return text;
    }

    // метод: выводит название класса и значение поля
    public void show() {
        System.out.println("Class name: " + this.getClass().getSimpleName() +
                ", text = " + text);
    }
}
