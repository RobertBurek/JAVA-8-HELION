package CoffeeMachine.model;

/**
 * Created by Robert Burek
 */
public class SugarBox extends Box {

    private static final int MAX_SUGAR = 60;

    @Override
    void fillIt() {
        numberOfProduct = MAX_SUGAR;
    }

    @Override
    public String toString() {
        return "SugarBox{" +
                numberOfProduct +
                '}';
    }
}
