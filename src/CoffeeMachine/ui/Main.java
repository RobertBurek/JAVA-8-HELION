package CoffeeMachine.ui;


import CoffeeMachine.logic.CoffeeMachine;
import CoffeeMachine.logic.EspressoMaker;
import CoffeeMachine.logic.LatteMacchiatoMaker;
import CoffeeMachine.logic.view.UserInterface;

import java.util.Scanner;

/**
 * Created by Robert Burek
 */
public class Main {

    public static void main(String[] args) {

        CoffeeMachine coffeeMachine = new EspressoMaker(new AdvaceUi());
        String typeCoffee;
        do {
            typeCoffee = getTypeCoffee("Witam, wybierz kawę:\n [E] - Espresso\n [L] - Latte Macchiato\n [Q] - Stop ");
            if (!typeCoffee.equalsIgnoreCase("q")) {
                switch (typeCoffee) {
                    case "E":
                    case "e":
                        coffeeMachine = new EspressoMaker(new AdvaceUi());
                        break;
                    case "L":
                    case "l":
                        coffeeMachine = new LatteMacchiatoMaker(new AdvaceUi());
                        break;
                }
                typeCoffee = getTypeCoffee("Cukier?:\n [Z] - z cukrem\n [B] - bez cukru\n [Q] - Stop ");
                if (!typeCoffee.equalsIgnoreCase("q")) {
                    switch (typeCoffee) {
                        case "Z":
                        case "z":
                            coffeeMachine.makeCoffee(true);
                            break;
                        case "B":
                        case "b":
                            coffeeMachine.makeCoffee(false);
                            break;
                    }
                }
            }
        } while (!(typeCoffee.equalsIgnoreCase("q")));
        System.out.println(coffeeMachine.showStorage());
    }

    private static String getTypeCoffee(String s) {
        String typeCoffee;
        System.out.println(s);
        Scanner choiceCoffee = new Scanner(System.in);
        typeCoffee = choiceCoffee.next();
        return typeCoffee;
    }

    private static class AdvaceUi implements UserInterface {
        @Override
        public void showStep(String msg) {
            System.out.println("-" + msg);
        }

        @Override
        public void showError(String msg) {
            System.out.println("##" + msg + "##");
        }

        @Override
        public void showCoffeeReady(String msg) {
            System.out.println("==" + msg + "==");
        }

        @Override
        public void playSound() {
            System.out.println("BIEP! BIEP!");
        }
    }
}