package CoffeeMachine.logic;

import CoffeeMachine.logic.view.UserInterface;

/**
 * Created by Robert Burek
 */
public class EspressoMaker extends Maker {

    EspressoMaker(UserInterface userInterface) {
        super(userInterface);
    }

    @Override
    public void makeCoffee() {
        super.makeCoffee();
        boolean status = coffeeComponent.addComponent();
        if (status) {
            userInterface.showCoffeeReady("Espresso gotowe");
        }
    }
}
