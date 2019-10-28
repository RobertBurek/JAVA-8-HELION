package myPackage.shapes;

/**
 * Created by Robert Burek
 */
public abstract class Shape {

//    public Shape() {
//        System.out.println("Konstruktor z SHAPE.");
//        System.out.println("w konstruktorze SHAPE: " + getName());
//    }

    abstract int countPerimeter();  //brak ciała metody abstrakcyjnej, trzeba implementować w klasie dziedziczącej

    abstract int countArea();   //brak ciała metody abstrakcyjnej, trzeba implementować w klasie dziedziczącej

    public String getName() {
        return getClass().getSimpleName();
    }
}
