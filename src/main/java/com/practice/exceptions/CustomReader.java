package com.practice.exceptions;


import org.apache.log4j.Logger;

/**
 * This class implements AutoCloseable.
 *
 *
 */
public class CustomReader implements AutoCloseable {

    private static Logger log = Logger.getLogger(CustomReader.class);
    @Override
    public void close() throws Exception {
        log.info("The close method called for CustomReader !!!");
    }
}
