package command2;

public class Player {
    private String name;
    private int x = 0;
    private int y = 0;

    public Player(String name) {
        this.name = name;
    }

    public String toString() {
        return "Player{name='" + this.name + "', x=" + this.x + ", y=" + this.y + "}";
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
