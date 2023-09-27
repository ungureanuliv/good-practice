package factorymethod;

public class BoardGame implements Game {

    private String name;
    private int min;
    private int max;

    public BoardGame(String name, int min, int max) {
        this.name = name;
        this.min = min;
        this.max = max;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int minPlayers() {
        return min;
    }

    @Override
    public int maxPlayers() {
        return max;
    }

    @Override
    public boolean isOnline() {
        return false;
    }

    @Override
    public void play() {
        System.out.println("Playing a board game called: " + name);
    }
}
