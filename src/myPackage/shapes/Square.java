package myPackage.shapes;

/**
 * Created by Robert Burek
 */
public final class Square extends Shape {
    private int size;

    public Square() {
        super();
        System.out.println("Konstruktor z SQUAR.");
        System.out.println("w konstruktorze SQUAR: " + getName());
    }

    public Square(int size) {
        this.size = size;
    }

    int getSize() {
        return size;
    }

    void setSize(int size) {
        this.size = size;
    }

    @Override
    public int countArea() {
        return size * size;
    }

    @Override
    public int countPerimeter() {
        return 4 * size;
    }
}
