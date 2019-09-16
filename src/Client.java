public class Client {

    public static void main(String[] args) {

        LoggerFactory factory = new LoggerFactory();

        Logger logger = factory.getLogger();
        Logger logger1 = factory.getLogger();

        HTMLLogger hlogger = new HTMLLogger(logger);
        hlogger.log("A message to log");

        EncryptLogger eLogger = new EncryptLogger(logger1);
        eLogger.log("A message to Log");
     }

}
