package CoffeeMachine.logic.components;

import CoffeeMachine.logic.view.UserInterface;
import CoffeeMachine.model.Storage;
import CoffeeMachine.model.exceptions.EmptyBoxException;

/**
 * Created by Robert Burek
 */
public class CoffeeComponent extends Component {

    boolean withSugar;


    public CoffeeComponent(Storage storage, UserInterface userInterface, boolean withSugar) {
        super(storage, userInterface);
        this.withSugar = withSugar;
    }

    @Override
    void tryAddComponent() throws EmptyBoxException {
        storage.getCoffee();
        userInterface.showStep("Kawa");
        if (withSugar) {
            storage.getSugar();
            userInterface.showStep("z cukrem");
        }
    }

    @Override
    public String showStorage() {
        return storage.toString();
    }
}
