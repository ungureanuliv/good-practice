package singleton;

public class Student {

    private String name;
    public Student(String name){
        this.name = name;

        Logger logger = Logger.getInstance();
        System.out.println("From main: " + logger);
        logger.debug( "This is a message from the main method!");

    }
}
