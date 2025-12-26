package LW7.Task2;

public class SubClassTest2 extends SuperClassTest2 {

    // дополнительное открытое (публичное) целочисленное поле
    public int number;

    // конструктор подкласса: два параметра (целое и текст)
    public SubClassTest2(int number, String text) {
        super(text);
        this.number = number;
    }

    // 1) версия без параметров (переопределение по смыслу/расширение набора)
    public void setValue() {
        super.setValue("DEFAULT");
        this.number = 0;
    }

    // 2) с текстовым параметром (переопределение метода суперкласса)
    @Override
    public void setValue(String text) {
        super.setValue(text);
    }

    // 3) с целочисленным параметром (перегрузка)
    public void setValue(int number) {
        this.number = number;
    }

    // 4) с текстовым и целочисленным параметром (перегрузка)
    public void setValue(String text, int number) {
        super.setValue(text);
        this.number = number;
    }
}
