package com.practice.exceptions;

/**
 * This class explains the exception handling.
 *
 * The RuntimeException are the unchecked exception
 *
 * https://dzone.com/articles/java-exceptions-handling-mechanism
 *
 * https://dzone.com/articles/carefully-specify-multiple-resources-in-single-try
 * https://dzone.com/articles/java-exceptions-handling-mechanism
 *
 */
public class ExceptionHandlingDemo {

    public static void main(String[] args) throws Exception {

        /***
         *
         * We can use try-with-resource inside the try statement, if the Class extends the AutoCloseable interface.
         *
         * We can use multiple resources separated by - semicolon (;)
         * the variable must be declared inside the try-with-resource to call the Close() method.
         */
        try(CustomReader customReader = new CustomReader();
                OuterResource outerResource = new OuterResource(customReader)) {
            int x = 10;
            if(x == 11) {
                throw new Exception();
            }
            throw new MyUncheckedException("This is custom unchecked exception");
            /** see the method signature, it has not been added into the throws clause */

        }
        catch(MyUncheckedException ex){
            throw new MyUncheckedException("This is custom unchecked exception");
        }
        catch(Exception exception){
            throw new MyException("This is custom exception.", exception);
        }
    }
}