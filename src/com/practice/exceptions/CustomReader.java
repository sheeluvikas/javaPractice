package com.practice.exceptions;


/**
 * This class implements AutoCloseable.
 *
 *
 */
public class CustomReader implements AutoCloseable {

    @Override
    public void close() throws Exception {
        System.out.println("The close method called for CustomReader !!!");
    }
}
