package factorymethod.plants;

public class Tree implements Plants{

    private String name;
    private String colour;
    private int height;

    public Tree(String name, String colour, int height) {
        this.name = name;
        this.colour = colour;
        this.height = height;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public String colour() {
        return colour;
    }

    @Override
    public int height() {
        return height;
    }

    @Override
    public String toString() {
        return "Tree{" +
                "name='" + name + '\'' +
                ", colour='" + colour + '\'' +
                ", height=" + height +
                '}';
    }
}
