package observer;

public class User implements Subscriber {

    private String name;

    public User( String name){
        this.name = name;
    }
    @Override
    public void watchMovie(Movie movie) {
        System.out.println("["+name+"] Watching movie: "+ movie);
    }

    @Override
    public void readNotification(String message) {
        System.out.println("["+name+"] Reading message: "+ message);
    }
}
