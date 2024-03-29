package CoffeeMachine.logic;

import CoffeeMachine.logic.view.UserInterface;

/**
 * Created by Robert Burek
 */
public class LatteMacchiatoMaker extends Maker {

    public LatteMacchiatoMaker(UserInterface userInterface) {
        super(userInterface);
    }

    @Override
    public void makeCoffee(boolean withSugar) {
        super.makeCoffee(withSugar);
        boolean status = coffeeComponent.addComponent() && milkComponent.addComponent() && chocolateComponent.addComponent();
        if (status) {
            userInterface.showCoffeeReady("Macchiato gotowe");
        }
//        coffeeComponent.showStorage();
    }

    @Override
    public String showStorage() {
        return coffeeComponent.showStorage();
    }

}
