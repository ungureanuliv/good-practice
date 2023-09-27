package facade;

import facade.model.Water;

public class Boiler {

    Water boilWater(){
        System.out.println("Fill tank");
        System.out.println("Heat water");
        return new Water();

        //TODO homework: modify boilWater to receive a Water param and add a isBoiled flag to Water class,
    }
}
