package CoffeeMachine.model;

import CoffeeMachine.model.exceptions.EmptyBoxException;

/**
 * Created by Robert Burek
 */
public class Storage {
    private static Storage storage;
    CoffeeBox coffeeBox;
    MilkBox milkBox;
    ChocolateBox chocolateBox;
    SugarBox sugarBox;

    private Storage() {
        milkBox = new MilkBox();
        coffeeBox = new CoffeeBox();
        chocolateBox = new ChocolateBox();
        sugarBox = new SugarBox();
        fillAll();
    }

    public static Storage getInstance() {
        if (storage == null) {
            storage = new Storage();
        }
        return storage;
    }

    public void fillAll() {
        milkBox.fillIt();
        coffeeBox.fillIt();
        chocolateBox.fillIt();
        sugarBox.fillIt();
    }

    public void getCoffee() throws EmptyBoxException {
        if (!coffeeBox.takeProduct()) {
            throw new EmptyBoxException("kawa");
        }
    }

    public void getMilk() throws EmptyBoxException {
        if (!milkBox.takeProduct()) {
            throw new EmptyBoxException("mleko");
        }
    }

    public void getChocolate() throws EmptyBoxException {
        if (!chocolateBox.takeProduct()) {
            throw new EmptyBoxException("czekolada");
        }
    }

    public void getSugar() throws EmptyBoxException {
        if (!sugarBox.takeProduct()) {
            throw new EmptyBoxException("cukier");
        }
    }

    @Override
    public String toString() {
        return "Storage: " +
                coffeeBox +
                ", " + milkBox +
                ", " + chocolateBox +
                ", " + sugarBox +
                '.';
    }
}
