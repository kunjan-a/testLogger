import test.olympus.LogTester;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class LogTestMain {

    public static void main(String[] args) {
        final LogTester logTester = new LogTester();
        logTester.run("sync");

        ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
        scheduledExecutorService.scheduleAtFixedRate(new Runnable() {
            public void run() {
                logTester.run("async");
            }
        }, 2, 5, TimeUnit.SECONDS);
    }
}
