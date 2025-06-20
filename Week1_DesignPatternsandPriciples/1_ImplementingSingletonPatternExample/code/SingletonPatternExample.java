public class SingletonPatternExample{
    static public class Logger {
    private static Logger instance;
    private Logger() {
        System.out.println("Logger Initialized");
    }
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();  
        }
        return instance;
    }
 public void log(String message) {
        System.out.println("Log: " + message);
    }
}
public class LoggerTest {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        logger1.log("This is the first log message.");
        Logger logger2 = Logger.getInstance();
        logger2.log("This is the second log message.");
        System.out.println("Are logger1 and logger2 the same? " + (logger1 == logger2));
    }
}

}