package myPackage;

import java.util.Objects;

/**
 * Created by Robert Burek
 */
public class SampleOther {
    String name;
    String surname;
    int age;

    public SampleOther(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SampleOther that = (SampleOther) o;
        return  Objects.equals(name, that.name) &&
                Objects.equals(surname, that.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }

    public int myhashCode() {
        return Objects.hash(name, surname, age);
    }
}
