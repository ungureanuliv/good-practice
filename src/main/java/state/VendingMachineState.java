package state;

public interface VendingMachineState {

    void handleSelection(String id);
    void countMoney(int value);
    void prepareDrink();
}
