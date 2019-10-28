package myPackage.shapes;

/**
 * Created by Robert Burek
 */
public class Triangle implements IShape {

    int sideA;
    int sideB;
    int sideC;

    public Triangle(int sideA, int sideB, int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    int getSideA() {
        return sideA;
    }

    void setSideA(int sideA) {
        this.sideA = sideA;
    }

    int getSideB() {
        return sideB;
    }

    void setSideB(int sideB) {
        this.sideB = sideB;
    }

    int getSideC() {
        return sideC;
    }

    void setSideC(int sideC) {
        this.sideC = sideC;
    }

    @Override
    public int countArea() {
        double p = (sideA + sideB + sideC) / 2;
        double area = Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
        return (int) area;
    }

    @Override
    public int countPerimeter() {
        return sideA + sideB + sideC;
    }
}
