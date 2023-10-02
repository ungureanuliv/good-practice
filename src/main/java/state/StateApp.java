package state;

public class StateApp {

    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine();

        machine.makeSelection("coffee");
        machine.insertMoney(100);
        machine.takeDrink();
    }
}
