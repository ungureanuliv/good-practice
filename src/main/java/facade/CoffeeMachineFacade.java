package facade;

import facade.model.CoffeeBean;
import facade.model.CoffeeDrink;
import facade.model.GroundCoffee;
import facade.model.Water;

public class CoffeeMachineFacade {
    // 1. create a method that returns the desired, final type ==> CoffeeDrink
    public CoffeeDrink makeCoffee (){
        Grinder grinder = new Grinder();
        Boiler boiler = new Boiler();
        Filter filter = new Filter();

        CoffeeBean[] beans = new CoffeeBean[] {new CoffeeBean(), new CoffeeBean(), new CoffeeBean() };
        GroundCoffee groundCoffee = grinder.grind(beans);
        Water hotWater = boiler.boilWater();
        CoffeeDrink coffeeDrink = filter.prepareCoffee(groundCoffee, hotWater);
        return coffeeDrink;
    }
}
