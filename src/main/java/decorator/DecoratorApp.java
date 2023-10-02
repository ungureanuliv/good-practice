package decorator;

public class DecoratorApp {
    public static void main(String[] args) {
        //normal notification --> console
        //important notification --> console + FB msg
        //urgent notification --> console + FB msg SMS

//        Notifier notifier = new ConsoleNotifier();
//        notifier.notify("Say hello");

        Notifier normalNotificationService = new ConsoleNotifier();
        Notifier importantNotificationService = new FacebookNotifier(new ConsoleNotifier()); // FacebookNotifier2
        Notifier urgentNotificationService = new SmsNotifier(new FacebookNotifier(new ConsoleNotifier()));
        Notifier smsAndConsoleNotifier = new SmsNotifier(new ConsoleNotifier());
        Notifier fbSmsConsoleNotifier = new FacebookNotifier(new SmsNotifier(new ConsoleNotifier()));


        normalNotificationService.notify("Say hello!");
        System.out.println();
        importantNotificationService.notify("This is an important message!");
        System.out.println();
        urgentNotificationService.notify("Call me, it's urgent!");
        System.out.println();
        smsAndConsoleNotifier.notify("I'm a fancy message!");
        System.out.println();
        fbSmsConsoleNotifier.notify("Facebook is the best, or no!");
    }
}
