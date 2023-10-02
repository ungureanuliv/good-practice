package command2;

public class GameApp {
    public GameApp() {
    }

    public static void main(String[] args) {
        Player sefu = new Player("SEFU");
        System.out.println(sefu);
        ForwardCommand forwardCommand = new ForwardCommand(sefu);
        forwardCommand.apply(10, -10);
        System.out.println(sefu);
        JumpCommand jumpCommand = new JumpCommand(sefu);
        jumpCommand.apply(25, 50);
        System.out.println(sefu);
    }
}
