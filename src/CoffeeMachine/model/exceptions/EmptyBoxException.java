package CoffeeMachine.model.exceptions;

/**
 * Created by Robert Burek
 */
public class EmptyBoxException extends Exception {

    public EmptyBoxException(String nameOfProduct) {
        super("Brak produktu: " + nameOfProduct);
    }
}
