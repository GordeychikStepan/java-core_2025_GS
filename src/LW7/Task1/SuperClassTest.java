package LW7.Task1;

public class SuperClassTest {

    // приватное текстовое поле
    private String str1;

    // конструктор с текстовым параметром
    public SuperClassTest(String str1) {
        this.str1 = str1;
    }

    // конструктор без параметров
    public SuperClassTest() {
    }

    // геттер
    public String getStr1() {
        return str1;
    }

    // сеттер
    public void setStr1(String str1) {
        this.str1 = str1;
    }

    // переопределённый toString()
    @Override
    public String toString() {
        return "Class name: " + this.getClass().getSimpleName() + "\n" +
                "str1 = " + str1;
    }
}
