package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorApp {

    public static void main(String[] args) {
        List<String> elements = new ArrayList<>();
        elements.add("a");
        elements.add("b");
        elements.add("c");

        /*for (String e:elements) {
            Iterator<String> iterator = elements.iterator();
            while (iterator.hasNext()){
                String element = iterator.next();
            }
            */

        Car car1 = new SimpleCar("VW", "CT-01-AAA");
        Car car2 = new SimpleCar("Opel", "TM-04-BBB");
        Car car3 = new SimpleCar("Ford", "CJ-02-CCC");
        Car car4 = new SimpleCar("Ford","B-100-DDD");
        Car car5 = new SimpleCar("Ford","B-200-EEE");
        Car car6 = new SimpleCar("Ford","B-300-FFF");
        ParkingLot parking = new ParkingLot();

        boolean result = parking.parkCar(car1);
        System.out.println(car1 + "was parked? "+ result);

        result = parking.parkCar(car2);
        System.out.println(car2 + "was parked? "+ result);

        result = parking.parkCar(car3);
        System.out.println(car3 + "was parked? "+ result);

        result = parking.parkCar(car4);
        System.out.println(car4 + "was parked? "+ result);

        result = parking.parkCar(car5);
        System.out.println(car5 + "was parked? "+ result);

        result = parking.parkCar(car6);
        System.out.println(car6 + "was parked? "+ result);

        //using the iterator pattern

        int index = 1;
        System.out.println("Listing the cars in the parking: ");
        for (Car car : parking ){
            System.out.println(index + ": " + car);
            index++;
        }
    }
}

