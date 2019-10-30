package CoffeeMachine.model;

/**
 * Created by Robert Burek
 */
public class MilkBox extends Box {

    private static final int MAX_MILK = 15;

    @Override
    void fillIt() {
        numberOfProduct = MAX_MILK;
    }

    @Override
    public String toString() {
        return "MilkBox{" +
                numberOfProduct +
                '}';
    }
}
