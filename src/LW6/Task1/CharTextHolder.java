package LW6.Task1;

public class CharTextHolder {

    private char ch;        // символьное поле
    private String text;    // текстовое поле

    // Перегруженный метод: аргумент char -> присваиваем символьному полю
    public void setValue(char value) {
        this.ch = value;
    }

    // Перегруженный метод: аргумент String -> присваиваем текстовому полю
    public void setValue(String value) {
        this.text = value;
    }

    // Перегруженный метод: аргумент char[] -> 1 символ в ch, иначе строка в text
    public void setValue(char[] value) {
        if (value == null) {
            // на случай, если передали null
            this.text = null;
            return;
        }

        if (value.length == 1) {
            this.ch = value[0];
        } else {
            this.text = new String(value);
        }
    }

    @Override
    public String toString() {
        return "CharTextHolder{ch=" + ch + ", text=" + text + "}";
    }
}
