package dependencyinversiongood;

public class Car2 {

    private Engine2 engine; // is null

    Car2(Engine2 carEngine) {
        this.engine = carEngine;
    }
}
