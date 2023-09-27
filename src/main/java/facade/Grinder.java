package facade;

import facade.model.CoffeeBean;
import facade.model.GroundCoffee;

public class Grinder {

    GroundCoffee grind(CoffeeBean[] beans) {
        System.out.println("Starting grinder");
        System.out.println("Grinding" + beans.length + "beans of coffee");
        return new GroundCoffee();
    }
}
