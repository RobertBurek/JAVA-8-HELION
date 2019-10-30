package CoffeeMachine.logic.components;

import CoffeeMachine.logic.view.UserInterface;
import CoffeeMachine.model.Storage;
import CoffeeMachine.model.exceptions.EmptyBoxException;

/**
 * Created by Robert Burek
 */
public class SugarComponent extends Component {

    public SugarComponent(Storage storage, UserInterface userInterface) {
        super(storage, userInterface);
    }

    @Override
    void tryAddComponent() throws EmptyBoxException {
        storage.getSugar();
        userInterface.showStep("Cukier");
    }

    @Override
    String showStorage() {
        return null;
    }
}
