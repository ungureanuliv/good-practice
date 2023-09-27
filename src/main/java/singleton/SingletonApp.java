package singleton;

public class SingletonApp {
    public static void main(String[] args) {
        //Logger logger = new Logger(); // doesn't work because the constructor is private

        Logger logger = Logger.getInstance(); // because the method is static
        System.out.println("From main: " + logger);

        logger.info("This is a message from the main method!");
        Student student = new Student("John D.");
    }
}
