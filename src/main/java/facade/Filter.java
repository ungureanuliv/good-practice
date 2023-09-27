package facade;

import facade.model.CoffeeBean;
import facade.model.CoffeeDrink;
import facade.model.GroundCoffee;
import facade.model.Water;

public class Filter{

    CoffeeDrink prepareCoffee (GroundCoffee groundCoffee, Water water){
        System.out.println("Making coffee from " + groundCoffee +"and" + water);
        return new CoffeeDrink();
    }
}
