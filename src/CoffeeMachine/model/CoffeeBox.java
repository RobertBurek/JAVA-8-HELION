package CoffeeMachine.model;

/**
 * Created by Robert Burek
 */
class CoffeeBox extends Box {

    private static final int MAX_COFFEE = 30;

    @Override
    void fillIt() {
        numberOfProduct = MAX_COFFEE;
    }

    @Override
    public String toString() {
        return "CoffeeBox{" +
                numberOfProduct +
                '}';
    }
}
