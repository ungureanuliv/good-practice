package state;

public class VendingMachine {

    private VendingMachineState state;

    public VendingMachine() {
        state = new WaitForSelectionMachineState();
    }


    public void makeSelection(String id){
        state.handleSelection(id);
        state = new WaitForMoneyState();
    }
    public void insertMoney(int value){
        state.countMoney(value);
        state = new PrepareDrinkState();
        state.prepareDrink();
        state = new DrinkReadyState();
    }
    public void takeDrink(){
        state = new WaitForSelectionMachineState();
        System.out.println("Resetting the machine to waiting state!");
    }
}
