package com.pci.logbackDemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 *
 */
public class App 
{
    private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) throws InterruptedException
    {
        // System.out.println( "Hello World!" );
        // Logger.
        // LoggerContext lc = (LoggerContext)LoggerFactory.getILoggerFactory();
        // StatusPrinter.print(lc);

        LOGGER.info("hello world logback");
        LOGGER.debug("debug information for PCI standard");
        LOGGER.error("crash error crush down");
        LOGGER.warn("warn information for PCI standard");
        LOGGER.trace("trace message is print");
        int i = 0;
        while (i < 1) {
            i++;
            // Thread.sleep(200);
            LOGGER.info("hello world logback {}", i);
        }
    }
}
