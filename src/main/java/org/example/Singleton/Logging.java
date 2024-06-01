package org.example.Singleton;

import java.time.LocalDate;

public class Logging {

    private static volatile Logging logging;

    private Logging() {}

    public static Logging ofLogging() {
        if (logging == null) {
            synchronized (Logging.class) {
                if (logging == null) {
                    logging = new Logging();
                }
            }
        }
        return logging;
    }

    public String classLog(Object obj, String info) {
        return String.format("Log info: %s - %s - %s", LocalDate.now(), obj.getClass().getSimpleName(), info);
    }

}
