package CoffeeMachine.model;

/**
 * Created by Robert Burek
 */
abstract class Box {
    int numberOfProduct = 0;

    boolean takeProduct() {
        if (isEmpty()) {
            return false;
        }
        numberOfProduct--;
        return true;
    }

    boolean isEmpty() {
        return numberOfProduct <= 0;
    }

    abstract void fillIt();

}
