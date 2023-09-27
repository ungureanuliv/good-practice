package dependencyinversion;

public class Car {

    private Engine engine = new Engine(); // doesn't honor the DI principal
}
