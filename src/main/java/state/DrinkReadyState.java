package state;

public class DrinkReadyState implements VendingMachineState{
    @Override
    public void handleSelection(String id) {
        throw new UnsupportedOperationException("Selection is not allowed in this state!");
    }

    @Override
    public void countMoney(int value) {

    }

    @Override
    public void prepareDrink() {

    }
}
