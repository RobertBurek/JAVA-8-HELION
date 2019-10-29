package CoffeeMachine.logic.components;

import CoffeeMachine.logic.view.UserInterface;
import CoffeeMachine.model.Storage;
import CoffeeMachine.model.exceptions.EmptyBoxException;


/**
 * Created by Robert Burek
 */
public class ChocolateComponent extends Component {

    public ChocolateComponent(Storage storage, UserInterface userInterface) {
        super(storage, userInterface);
    }

    @Override
    void tryAddComponent() throws EmptyBoxException {
        storage.getChocolate();
        userInterface.showStep("Czekolada");
    }
}
