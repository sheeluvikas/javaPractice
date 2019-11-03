package com.practice.lambdas;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.omg.PortableServer.THREAD_POLICY_ID;

/**
 * This class explains the concept of Method References in java 8
 *
 */
public class MethodReferenceDemo {

    public static void main(String args[]){
        Thread thread = new Thread(() -> printMessage()); // () -> printMessage() ~ Functional Interface : Runnable
        /** Runnable can be used where the method takes no arguments and returns void */

        /** The above can also be written as below : (Method References) */
        Thread thread1 = new Thread(MethodReferenceDemo::printMessage);



        thread.start();
        thread1.start();

    }

    /**
     * This takes no arguments and returns void, Runnable interface can be used for this as functional interface
     *
     */
    public static void printMessage(){
        System.out.println("Hello");
    }
}
