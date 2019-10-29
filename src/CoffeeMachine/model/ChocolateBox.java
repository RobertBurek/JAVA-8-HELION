package CoffeeMachine.model;

/**
 * Created by Robert Burek
 */
class ChocolateBox extends Box {

    private static final int MAX_CHOCOLATE = 10;

    @Override
    void fillIt() {
        numberOfProduct = MAX_CHOCOLATE;
    }

}
