package command2;

public class JumpCommand implements MovementCommand {
    private final Player player;

    public JumpCommand(Player player) {
        this.player = player;
    }

    public void apply(int x, int y) {
        this.player.setX(x);
        this.player.setY(y);
    }
}
