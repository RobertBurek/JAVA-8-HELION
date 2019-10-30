package CoffeeMachine.logic;

import CoffeeMachine.logic.components.ChocolateComponent;
import CoffeeMachine.logic.components.CoffeeComponent;
import CoffeeMachine.logic.components.MilkComponent;
import CoffeeMachine.logic.components.SugarComponent;
import CoffeeMachine.logic.view.UserInterface;
import CoffeeMachine.model.Storage;


/**
 * Created by Robert Burek
 */
abstract class Maker implements CoffeeMachine {

    UserInterface userInterface;
    ChocolateComponent chocolateComponent;
    CoffeeComponent coffeeComponent;
    MilkComponent milkComponent;
    SugarComponent sugarComponent;
//    private boolean sugar;

    Maker(UserInterface userInterface) {
        this.userInterface = userInterface;
    }

    @Override
    public void makeCoffee(boolean withSugar) {
        Storage storage = Storage.getInstance();
        coffeeComponent = new CoffeeComponent(storage, userInterface, withSugar);
        milkComponent = new MilkComponent(storage, userInterface);
        chocolateComponent = new ChocolateComponent(storage, userInterface);
        sugarComponent = new SugarComponent(storage, userInterface);
    }

//    @Override
//    public void addSugar() {
//        sugar = true;
//        userInterface.showStep("Dodano cukier");
//    }

    @Override
    public void setUserInterface(UserInterface userInterface) {
        userInterface = userInterface;
    }
}
