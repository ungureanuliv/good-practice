package factorymethod;

public interface Game {
    String getName ();
    int minPlayers();
    int maxPlayers();

    boolean isOnline();
    void play();
}
