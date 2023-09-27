package facade;

import facade.model.CoffeeBean;
import facade.model.CoffeeDrink;
import facade.model.GroundCoffee;
import facade.model.Water;

public class FacadeApp { // this is our client
    public static void main(String[] args) {

        //grind
        //boil water
        //filter coffee

        // non pattern usage

        CoffeeMachineFacade coffeeMachineFacade = new CoffeeMachineFacade();
        CoffeeDrink coffeeDrink = coffeeMachineFacade.makeCoffee();
    }
}

