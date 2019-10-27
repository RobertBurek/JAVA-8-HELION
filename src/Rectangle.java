/**
 * Created by Robert Burek
 */
public class Rectangle {
    static final int MAX_WIDTH = 40;
    static final int MAX_HEIGHT = 140;
    int height;
    int width;

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

    static void staticMethod(){
        System.out.println(MAX_HEIGHT);
    }

    void classMethod(){
        System.out.println(height);
    }
}
