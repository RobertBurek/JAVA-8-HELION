package CoffeeMachine.logic.components;

import CoffeeMachine.logic.view.UserInterface;
import CoffeeMachine.model.Storage;
import CoffeeMachine.model.exceptions.EmptyBoxException;

/**
 * Created by Robert Burek
 */
public class CoffeeComponent extends Component {


    public CoffeeComponent(Storage storage, UserInterface userInterface) {
        super(storage, userInterface);
    }

    @Override
    void tryAddComponent() throws EmptyBoxException {
        storage.getCoffee();
        userInterface.showStep("Kawa");
    }
}
