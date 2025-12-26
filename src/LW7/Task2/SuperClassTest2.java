package LW7.Task2;

public class SuperClassTest2 {

    // приватное текстовое поле
    private String text;

    // объект создаётся передачей одного текстового аргумента
    public SuperClassTest2(String text) {
        this.text = text;
    }

    // метод присваивания значения полю (текстовый параметр)
    public void setValue(String text) {
        this.text = text;
    }

    // метод, который возвращает длину текстовой строки
    public int getTextLength() {
        return (text == null) ? 0 : text.length();
    }

    public String getText() {
        return text;
    }
}
