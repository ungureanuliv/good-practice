package state;

public class WaitForSelectionMachineState implements VendingMachineState{
    @Override
    public void handleSelection(String id) {
        System.out.println("User has selected drink with id: "+ id);
    }

    @Override
    public void countMoney(int value) {
        throw new UnsupportedOperationException("Count money is not supported in this state!");
    }

    @Override
    public void prepareDrink() {
    throw new UnsupportedOperationException("Prepare drink is not supported in this state!");
    }
}
