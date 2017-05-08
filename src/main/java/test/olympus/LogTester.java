package test.olympus;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogTester {
    private static final Logger logger = LoggerFactory.getLogger(LogTester.class);

    public void run(String arg) {
        logger.trace("trace1:{}",arg);
        logger.debug("debug1:{}",arg);
        logger.info("info1:{}",arg);
        logger.warn("warn1:{}",arg);
        logger.error("error1:{}",arg);
    }
}
