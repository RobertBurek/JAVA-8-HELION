package CoffeeMachine.logic.view;

/**
 * Created by Robert Burek
 */
public interface UserInterface {

    void showStep(String msg);

    void showError(String msg);

    void showCoffeeReady(String msg);

    void playSound();
}
