package com.group8.logger;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

/**
 * Logger for using built in logger with milliseconds timing.
 */
public class ProgLogger {
    public Logger logger;
    FileHandler handler;
    static final String logFolder = "logs";
    private String filename;

    /**
     * Constructor for logger that uses built in logger with milliseconds timing.
     *
     * @param filename
     * @throws SecurityException
     * @throws IOException
     */
    public ProgLogger(String filename) throws SecurityException, IOException {
        this.filename = logFolder+File.separator+filename;
        File logFile = new File(this.filename);
        if (!logFile.exists()) {
            try {
                logFile.createNewFile();
            } catch (IOException e){
                File folder = new File(logFolder);
                folder.mkdir();
                logFile.createNewFile();
            }
        }
        handler = new FileHandler(this.filename, true);
        logger = Logger.getLogger(this.filename);
        logger.addHandler(handler);
        MilliLogFormatter logFormatter = new MilliLogFormatter();
        handler.setFormatter(logFormatter);
    }
}
