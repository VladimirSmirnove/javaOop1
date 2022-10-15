// Базовый класс
public class ded {
    private String name;
    private int age;

    public ded (String name, int age) {
        this.name = name;
        this.age = age;

    }

    public void Person() {
        System.out.println(toString() + "Я дедушка и отец");
    }

    @Override
    public String toString() {
        return "Я " + name + ", мне " + age + " лет, ";
    }
}