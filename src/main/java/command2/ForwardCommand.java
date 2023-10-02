package command2;

public class ForwardCommand implements MovementCommand {
    private final Player player;

    public void apply(int x, int y) {
        this.player.setX(x);
    }

    public ForwardCommand(Player player) {
        this.player = player;
    }
}