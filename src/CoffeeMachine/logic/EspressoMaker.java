package CoffeeMachine.logic;

import CoffeeMachine.logic.view.UserInterface;

/**
 * Created by Robert Burek
 */
public class EspressoMaker extends Maker {

    public EspressoMaker(UserInterface userInterface) {
        super(userInterface);
    }

    @Override
    public void makeCoffee(boolean withSugar) {
        super.makeCoffee(withSugar);
        boolean status = coffeeComponent.addComponent();
        if (status) {
            userInterface.showCoffeeReady("Espresso gotowe");
        }
    }

    @Override
    public String showStorage() {
        return coffeeComponent.showStorage();
    }

}
