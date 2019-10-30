package CoffeeMachine.logic;


import CoffeeMachine.logic.view.UserInterface;

/**
 * Created by Robert Burek
 */
public interface CoffeeMachine {

    void makeCoffee(boolean withSugar);

//    void addSugar();

    void setUserInterface(UserInterface userInterface);

    String showStorage();
}
