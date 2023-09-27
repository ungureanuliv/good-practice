package factorymethod.plants;

public class Plantsfactory {

    public Plants create(int height) {
        if (height <=100) {
            return new Flowers("Lalea", "verde", height);
        } else {
            return new Tree("Stejar", "verde", height);
        }
    }
}
