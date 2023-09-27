package sun2;

public class Planet {
    public Planet (String name ) {
        Sun sun = Sun.getInstance();
        sun.ShareLight(name);
    }
}
