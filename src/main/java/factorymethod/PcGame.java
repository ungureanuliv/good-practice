package factorymethod;

public class PcGame implements Game {

    private String name;
    private int min;
    private int max;
    private boolean online;

    public PcGame(String name, int min, int max, boolean online) {
        this.name = name;
        this.min = min;
        this.max = max;
        this.online = online;
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
        return online;
    }

    @Override
    public void play() {
        System.out.println("Playing a pc game called: " + name + " online: " + online);
    }
}
