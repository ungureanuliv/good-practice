package factorymethod;

public class FactoryMethodApp {
    public static void main(String[] args) {
        //without the factory
        BoardGame monopoly = new BoardGame("Monopoly", 2, 4);

        PcGame cs = new PcGame("CounterStrike", 2, 16, true);
        // with factory
        GameFactory factory = new GameFactory();
        Game game1 = factory.create("monopoly");
        Game game2 = factory.create("cs");
        Game game3 = factory.create("bomberman");

        game1.play();
        game2.play();
        game3.play();
    }
}
