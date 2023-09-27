package sun2;

public class SunApp {
    public static void main(String[] args) {
        Sun sun = Sun.getInstance();

        sun.ShareLight("Terra");
        sun.ShareLight("Mars");
        sun.ShareLight("Venus");
        Planet mercury = new Planet ("Mercury");
        Planet saturn = new Planet("Saturn");

    }
}
