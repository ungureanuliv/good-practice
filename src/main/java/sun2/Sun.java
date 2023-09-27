package sun2;

public final class Sun {
    private  final static Sun Instance = new Sun();

    private Sun(){
    }

    public void ShareLight (String planetName) {
        System.out.println("This is the planet called: " + planetName);
    }
    public static Sun getInstance() {
        return Instance;
    }
}
