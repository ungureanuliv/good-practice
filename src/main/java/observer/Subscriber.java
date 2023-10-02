package observer;

public interface Subscriber { // 1. this is the one who's interested in the subject, e.g. Netflix

    void watchMovie(Movie movie);
    void readNotification(String message);
}
