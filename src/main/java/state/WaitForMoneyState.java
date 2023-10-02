package state;

public class WaitForMoneyState implements VendingMachineState  {


    @Override
    public void handleSelection(String id) {
        throw new UnsupportedOperationException("Selection is not allowed in this state");
    }

    @Override
    public void countMoney(int value) {
        System.out.println("Got a total of: "+value+ "$");
    }

    @Override
    public void prepareDrink() {
        throw new UnsupportedOperationException("Prepare drink is not supported in this state!");
        //TODO Homework, apply DRY for methods that throw similar exceptions
    }
}
