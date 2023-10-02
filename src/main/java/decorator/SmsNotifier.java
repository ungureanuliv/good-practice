package decorator;

public class SmsNotifier implements Notifier{ //3. create as many layers as you want by implementing the interface

    private final Notifier baseClass;

    public SmsNotifier(Notifier baseClass) {
        // 4. constructor with a single parameter, the base class. The type is the interface, common to the base class
        this.baseClass = baseClass;
    }

    @Override
    public void notify(String message) {
        baseClass.notify(message);  // don't forget to call method from the base class and add a new functionality
        System.out.println("[SMS] " + message);
    }
}
