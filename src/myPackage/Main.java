package myPackage;

import myPackage.shapes.Triangle;

/**
 * Created by Robert Burek
 */
public class Main {

    public static void main(String[] args) {

//        KLASA i OBIEKT - abstrakcja

////        1) klasa abstrakcyjna
//        //Shape shape =new Shape();
//        Rectangle rectangle = new Rectangle();
//        Shape shape = rectangle;

//        2) Interfejs
        Triangle triangle = new Triangle(3, 4, 5);
        System.out.println("triangle.area = " + triangle.countArea());
        System.out.println("triangle.countPerimeter = " + triangle.countPerimeter());

    }
}