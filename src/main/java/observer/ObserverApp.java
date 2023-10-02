package observer;

public class ObserverApp {

    public static void main(String[] args) {
        Movie titanic = new Movie("Titanic" );
        Movie barbie = new Movie("Barbie");

                Netflix netflix = new Netflix();

       Subscriber user1 = new User("Joe");
       Subscriber user2 = new User("James");
       Subscriber user3 = new User("Ana");

        System.out.println("When there is no subscriber...");
        netflix.sendNewMovieMessage(titanic);

        netflix.subscribe(user1);
        System.out.println("When there is only 1 subscriber....");
        netflix.streamMovie(barbie);

        netflix.subscribe(user2);
        netflix.subscribe(user3);
        System.out.println("When there are 3 subscribers...");

        netflix.sendNewMovieMessage(titanic);
        netflix.streamMovie(titanic);

        netflix.unsubscribe(user1);
        System.out.println("After user 1 has canceled the subscription....");

        netflix.sendNewMovieMessage(new Movie("Rambo"));
    }
}
