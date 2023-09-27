package dependencyinversiongood;

public class App2 {

    public static void main(String[] args) {
        Engine2 engine = new Engine2();
        Car2 myCar = new Car2(engine);

        // but, this allows me to upgrade the engine

        ElectricEngine electricEngine = new ElectricEngine();
        Car2 myCar2 = new Car2(electricEngine);

        // myCar2 has an electric engine...
    }
}
