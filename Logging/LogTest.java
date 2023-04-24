import java.util.logging.*;

/* We see the INFO, WARNING, and SEVERE messages, each identified with a date and time!
stamp and the name of the class and method (LogTest main) from which they came.
Notice that the lower-level messages did not appear. This is because the default log!
ging level is normally set to INFO, meaning that only messages of severity INFO and
above are logged. Also note that the output went to the system console and not to a
logfile somewhere; that’s also the default. Now we’ll describe where these defaults are
set and how to override them at runtime.
*/

public class LogTest {
  public static void main(String argv[]) {
    Logger logger = Logger.getLogger("com.oreilly.LogTest");
    logger.severe("Power lost - running on backup!");
    logger.warning("Database connection lost, retrying...");
    logger.info("Startup complete.");
    logger.config("Server configuration: standalone, JVM version 1.5");
    logger.fine("Loading graphing package.");
    logger.finer("Doing pie chart");
    logger.finest("Starting bubble sort: value =" + 42);
  }
}
