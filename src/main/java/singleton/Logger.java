package singleton;

import java.time.LocalDate;
import java.time.LocalDateTime;

public final class Logger{  // 1. make the class final

    // 3. explicitly create only 1 instance (private final static) !!!!
    private final static Logger instance = new Logger(); // this is an eager initialization


    //2. make the constructor private
    private Logger (){

    }
    public void debug (String msg){

        System.out.println(LocalDateTime.now() + " [DEBUG] " + msg);
    }

    public void info (String msg){

        System.out.println(LocalDateTime.now() + " [INFO] " + msg);
    }

    public void warn (String msg){

        System.out.println(LocalDateTime.now() + " [WARN] " + msg);
    }



    //TODO homework: add a 4th method "error" in similar ways with the existing ones - done
    // TODO homework: practice DRY, try to extract a private method that reduce the code duplication in the  4 methods


    public void error (String msg){

       displayInfo("ERROR", msg);
    }

    public void displayInfo(String level, String msg) {
        System.out.println(LocalDateTime.now() + level + msg);
    }
    // 4. expose the only instance to the outer world e.g. other classes
    public static Logger getInstance(){

        return instance;
    }
}
