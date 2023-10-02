package decorator;

public class ConsoleNotifier implements Notifier{

    // 2. implement some basic functionality

    public void notify (String message) {
        System.out.println("[Console]" + message);
    }
}
