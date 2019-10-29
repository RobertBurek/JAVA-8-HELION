package CoffeeMachine.logic.components;

import CoffeeMachine.logic.view.UserInterface;
import CoffeeMachine.model.Storage;
import CoffeeMachine.model.exceptions.EmptyBoxException;


/**
 * Created by Robert Burek
 */
abstract class Component {

    Storage storage;
    UserInterface userInterface;

    public Component(Storage storage, UserInterface userInterface) {
        this.storage = storage;
        this.userInterface = userInterface;
    }

    public final boolean addComponent() {
        boolean status = false;
        try {
            tryAddComponent();
            status = true;
        } catch (EmptyBoxException ebe) {
            userInterface.showError("Brak produktu " + ebe.getMessage());
        } finally {
            userInterface.playSound();
        }
        return status;
    }

    abstract void tryAddComponent() throws EmptyBoxException;
}
