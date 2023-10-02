package state.wrong;

public class VendingMachineWrong {
    private VendingMachineStateWrong state;
    public void makeSelection(String id) {
        if (state == VendingMachineStateWrong.WAIT_FOR_SELECTION){
            // do some logic for selecting the drink
            state = VendingMachineStateWrong.WAIT_FOR_PAYMENT;
        }
    }
    public void insertMoney(){
        if (state == VendingMachineStateWrong.WAIT_FOR_PAYMENT){
            // do some money logic...
            state = VendingMachineStateWrong.PREPARE_DRINK;
            //prepare the drink and update the state...
        }
    }
}
