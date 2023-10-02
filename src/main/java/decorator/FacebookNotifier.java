package decorator;

public class FacebookNotifier implements Notifier {

    private final Notifier baseClass;
    public FacebookNotifier(Notifier baseClass ) {
        this.baseClass = baseClass;
    }
    @Override
    public void notify(String message){
        baseClass.notify(message); // don't forget to call the notify method in the base class

        System.out.println("[FACEBOOK]" + message);

    }
}
