package sortable;

public class Person implements Sortable {
    private int age;

    public Person(int age) {
        this.age = age;
    }

    @Override
    public int compare(Sortable other) {
        if (!(other instanceof Person)) throw new IllegalArgumentException("Incompatible types");
        Person o = (Person) other;
        return Integer.compare(this.age, o.age);
    }

    @Override
    public String toString() {
        return "Person (age=" + age + ")";
    }
}
