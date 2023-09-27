package factorymethod;

public class GameFactory {
    public Game create(String name){
        if(name.equalsIgnoreCase("Monopoly")){
            return new BoardGame("Monopoly", 2, 4);
        } else if (name.equalsIgnoreCase("cs")){
            return new PcGame("CounterStrike", 2, 16, true);
        }else if (name.equalsIgnoreCase("bomberman")){
            return new PcGame("Bomberman", 1, 2, false);
        }else {
            throw new RuntimeException("Unknown game type: " + name);
            //TODO homework: replace RTE with custom, cached exception
        }
    }
}
