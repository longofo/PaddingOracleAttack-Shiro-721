import org.apache.log4j.Logger;

public class TestLog4j {
    private static Logger logger = Logger.getLogger(TestLog4j.class.getClass());

    public static void main(String[] args) {
        logger.debug("debug msg");
        logger.info("info msg");
        logger.error("error msg");
    }
}
