package com.practice.exceptions;


/**
 * This is checked exception as this is being extended by Exception,
 * rather if it was extended by RuntimeException, it would have been an unchecked exception.
 *
 *
 */
public class MyException extends Exception {

    public MyException(String message, Throwable cause) {
        super(message, cause);
    }
}