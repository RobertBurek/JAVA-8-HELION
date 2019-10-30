package CoffeeMachine.ui;


import CoffeeMachine.logic.CoffeeMachine;
import CoffeeMachine.logic.EspressoMaker;
import CoffeeMachine.logic.LatteMacchiatoMaker;
import CoffeeMachine.logic.view.UserInterface;

/**
 * Created by Robert Burek
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Witam, wybierz kawę:\n [E] - Espresso\n [L] - Latte");
        CoffeeMachine coffeeMachine;
        coffeeMachine = new LatteMacchiatoMaker(new AdvaceUi());
        coffeeMachine.makeCoffee(true);
        coffeeMachine = new EspressoMaker(new AdvaceUi());
        coffeeMachine.makeCoffee(true);
        coffeeMachine.makeCoffee(true);
        coffeeMachine.makeCoffee(true);

        System.out.println(coffeeMachine.showStorage() );
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