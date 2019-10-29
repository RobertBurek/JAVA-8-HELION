package CoffeeMachine.logic;


import CoffeeMachine.logic.view.UserInterface;

/**
 * Created by Robert Burek
 */
public interface CoffeeMachine {

    void makeCoffee();

    void addSugar();

    void setUserInterface(UserInterface userInterface);
}
