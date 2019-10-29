package myPackage;

import java.util.Objects;

/**
 * Created by Robert Burek
 */
public class SampleClassTwo {
    String name;
    String surname;
    int age;

    public SampleClassTwo(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SampleClassTwo that = (SampleClassTwo) o;
        return age == that.age &&
                Objects.equals(name, that.name) &&
                Objects.equals(surname, that.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age);
    }
}
