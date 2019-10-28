package myPackage.shapes;

/**
 * Created by Robert Burek
 */
public final class Rectangle extends Shape {
    static final int MAX_WIDTH = 40;
    static final int MAX_HEIGHT = 140;
    private int height;
    private int width;

    public Rectangle() {
//        width = 0;
//        height = 0;
    }

    public Rectangle(int size) {
        this.height = size;
        this.width = size;
    }

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    int area() {
        return height * width;
    }

    int perimeter() {
        return height * 2 + width * 2;
    }

    static void staticMethod() {
        System.out.println(MAX_HEIGHT);
    }

    void classMethod() {
        System.out.println(height);
    }

    static int getMaxWidth() {
        return MAX_WIDTH;
    }

    static int getMaxHeight() {
        return MAX_HEIGHT;
    }

    int getHeight() {
        return height;
    }

    void setHeight(int height) {
        this.height = height;
    }

    int getWidth() {
        return width;
    }

    void setWidth(int width) {
        this.width = width;
    }

    @Override
    public int countArea() {
        return width * height;
    }

    @Override
    public int countPerimeter() {
        return width * 2 + height * 2;
    }
}
