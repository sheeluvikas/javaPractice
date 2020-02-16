package com.practice.exceptions;

public class OuterResource implements AutoCloseable {

    CustomReader customReader ;

    public OuterResource(CustomReader customReader) {
        this.customReader = customReader;
    }

    @Override
    public void close() throws Exception {
        System.out.println("The OuterResource is Closed() !!!");

        /**
         * Exception thrown in the close() method will be supressed.
         */
        throw new Exception("Exception in OuterResource ??? ");
    }
}
