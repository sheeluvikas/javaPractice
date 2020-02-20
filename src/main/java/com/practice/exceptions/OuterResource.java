package com.practice.exceptions;

import org.apache.log4j.Logger;

public class OuterResource implements AutoCloseable {

    private static Logger log = Logger.getLogger(OuterResource.class);
    CustomReader customReader ;

    public OuterResource(CustomReader customReader) {
        this.customReader = customReader;
    }

    @Override
    public void close() throws Exception {
        log.warn("The OuterResource is Closed() !!!");

        /**
         * Exception thrown in the close() method will be supressed.
         */
        throw new Exception("Exception in OuterResource ??? ");
    }
}
