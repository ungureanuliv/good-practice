package observer;

import java.util.ArrayList;
import java.util.List;

public class Netflix { // this is our subject

    private List<Subscriber> subscribers = new ArrayList<>();

    // the subject has ways to subscribe/unsubscribe
    public void subscribe(Subscriber user) {

        subscribers.add(user);
    }

    public void unsubscribe(Subscriber user)   {

        subscribers.remove(user);
    }

    // some functionality ...

    public void sendNewMovieMessage (Movie movie){
        String msg = "There is a new movie called: " + movie;
        for (Subscriber subscriber: subscribers){
            subscriber.readNotification(msg);
        }
    }

    public void streamMovie (Movie movie ){
        for (Subscriber subscriber: subscribers ){
            subscriber.watchMovie(movie);
        }
    }
}
