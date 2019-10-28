package myPackage.shapes;

/**
 * Created by Robert Burek
 */
class Shape {

    Shape() {
        System.out.println("Konstruktor z SHAPE.");
        System.out.println("w konstruktorze SHAPE: " + getName());
    }

    int countPerimeter() {
        return 0;
    }

    int countArea() {
        return 0;
    }

    public String getName() {
        return getClass().getSimpleName();
    }
}
