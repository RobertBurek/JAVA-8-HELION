package CoffeeMachine.logic.components;

import CoffeeMachine.logic.view.UserInterface;
import CoffeeMachine.model.Storage;
import CoffeeMachine.model.exceptions.EmptyBoxException;

/**
 * Created by Robert Burek
 */
public class MilkComponent extends Component {

    public MilkComponent(Storage storage, UserInterface userInterface) {
        super(storage, userInterface);
    }

    @Override
    void tryAddComponent() throws EmptyBoxException {
        storage.getMilk();
        userInterface.showStep("Mleko");
    }

    @Override
    String showStorage() {
        return null;
    }
}
