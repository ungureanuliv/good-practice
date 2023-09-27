package singleton;

import java.time.LocalDateTime;

public final class LoggerLazyLoading {

    private static LoggerLazyLoading instance;
    private LoggerLazyLoading (){}
    public void debug (String msg){

            System.out.println(LocalDateTime.now() + " [DEBUG] " + msg);
        }

        public void info (String msg){

            System.out.println(LocalDateTime.now() + " [INFO] " + msg);
        }

        public void warn (String msg){

            System.out.println(LocalDateTime.now() + " [WARN] " + msg);}

        public LoggerLazyLoading getInstance(){

            if (instance == null) {
                instance = new LoggerLazyLoading();
            }
            return instance;
    }
}
