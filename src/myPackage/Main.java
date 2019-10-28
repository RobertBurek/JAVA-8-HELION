package myPackage;

/**
 * Created by Robert Burek
 */
public class Main {

    public static void main(String[] args) {

//        KLASA i OBIEKT - zależności obiektów
//
////        1) konstruktory
//        Rectangle rectangle1 = new Rectangle();
//        System.out.println("rectangle1.height = " + rectangle1.height);
//        System.out.println("rectangle1.width = " + rectangle1.width);
//        Rectangle rectangle2 = new Rectangle(8);
//        System.out.println("rectangle2.height = " + rectangle2.height);
//        System.out.println("rectangle2.width = " + rectangle2.width);
//        Rectangle rectangle3 = new Rectangle(30, 40);
//        System.out.println("rectangle3.height = " + rectangle3.height);
//        System.out.println("rectangle3.width = " + rectangle3.width);

//        2) getery i setery - generyjemy automatycznie

//        3) Finalise metoda - czyszcząca pamięć - nie nadpisujemy

////        4) Dziedziczenie
//        Rectangle rectangle = new Rectangle(4,6);
//        Square square = new Square(5);
//        System.out.println("rectangle.countArea = "+ rectangle.countArea());
//        System.out.println("rectangle.countPerimeter = "+ rectangle.countPerimeter());
//        System.out.println("square.countArea = "+ square.countArea());
//        System.out.println("square.countPerimeter = "+ square.countPerimeter());
//        System.out.println("rectangle name: "+rectangle.getName());
//        System.out.println("square name: "+square.getName());

////        5) Super - wykonanie metody klasy dziedziczonej (nadrzędnej)
//        Square square = new Square();

//        6) Blokowanie dziedziczenia - FINAL - na klasie czy metodzie

////        7) Enkapsulacja - widoczność pól i zmiennych
////              public - powszechny
////              static - tylko w packed
////              private - tylko w danej klasie
////              protected - tylko z danego package oraz dla klas dziedziczących
//        Rectangle rectangle = new Rectangle(4, 6);
//        Square square = new Square(5);
//        System.out.println("rectangle.countArea = " + rectangle.countArea());
//        System.out.println("rectangle.countPerimeter = " + rectangle.countPerimeter());
//        System.out.println("square.countArea = " + square.countArea());
//        System.out.println("square.countPerimeter = " + square.countPerimeter());
//        System.out.println("rectangle name: " + rectangle.getName());
//        System.out.println("square name: " + square.getName());

//        8) Rzutowanie obiektów
        Object myObject = new Object();
        Object myString = "Treść Stringa";
        if (myObject instanceof String) {
            System.out.println("myString długość = " + ((String) myObject).length());
        }
        System.out.println("myString długość = " + ((String) myString).length());

    }
}