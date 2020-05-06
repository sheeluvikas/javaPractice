package com.practice.patterns.builder;

/**
 * This is Email Builder Exception, to be thrown when there is some exception while building the
 * Email Builder. for example, the required attributes are missing while building the Email Object.
 *
 */
public class EmailBuilderException extends RuntimeException {

    public EmailBuilderException(String message) {
        super(message);
    }
}
