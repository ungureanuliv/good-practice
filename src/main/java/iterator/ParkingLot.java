package iterator;

import java.lang.ref.PhantomReference;
import java.util.Iterator;

public class ParkingLot implements Iterable <Car> { // 1. implement the iterable <> interface

    private static final int MAX_CAPACITY=5;
    private int freeSpaces = MAX_CAPACITY;

    private int firstFreeSpace;


    private Car [] cars = new Car[MAX_CAPACITY]; // index --> 0...9 which adds up to 10 value

    public boolean parkCar (Car car){
        if (firstFreeSpace < MAX_CAPACITY ){ // 8<10 ---> true, 9 < 10 --> true, 10<10 -> false
            cars[firstFreeSpace] = car;
            firstFreeSpace++;
            return true;
        } else {
            // return false because we can't park the care
            return false;
        }
    }

    @Override
    public Iterator<Car> iterator() {
        return new CarIterator();
    }
    // 2. declare an iner class that implemetn the Iterator <>interface

    private class CarIterator implements Iterator <Car> {

        private int currentIndex;

        @Override
        public boolean hasNext() {
            //  0      1    2     firstFreeSpace(==3)
            // car1, car2, car3, null
            return currentIndex < firstFreeSpace;
        }

        @Override
        public Car next() {
            Car currentCar = cars[currentIndex];
            currentIndex++;
            return currentCar;
        }
    }

}
