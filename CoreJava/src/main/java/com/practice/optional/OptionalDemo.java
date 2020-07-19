package com.practice.optional;

import java.util.Optional;

public class OptionalDemo {

    public static void main(String[] args) {
        // creating Optional Objects
        Optional<String> stringOptional = Optional.empty();
        /** Thing to remember : stringOptional.get() here will give java.util.NoSuchElementException, if the optional is empty */
        System.out.println("The value inside an empty optional : " + stringOptional.orElse("Value is null inside the optional object !!!"));
        stringOptional = Optional.of("Vikas");

        // Do something if the value is present.
        stringOptional.ifPresent(System.out::println);

        String value = stringOptional.orElse("EMPTY");
        System.out.println(value);

        stringOptional = Optional.of("Rahul");
        value = stringOptional.filter((x) -> x.charAt(0) == 'R').orElse(getMyDefault());
        System.out.println(value);

        /** orElseGet() method takes the supplier, instead of the value as in case of orElse(), hence, the
         * supplier is called only when the optional is empty in case of orElseGet(), where as in case of
         * orElse, the method ( as can be seen in the above example) will be called even if the optional
         * is empty. This is very useful, when the method ( for example : getMyDefault() ) is a costly one */
        value = stringOptional.filter((x) -> x.charAt(0) == 'R').orElseGet(() -> mySupplier());
        System.out.println(value);

    }

    static String getMyDefault() {
        System.out.println("Calling Default !!!");
        return "Default 1 !!!";
    }

    static String mySupplier(){
        System.out.println("My Supplier : ");
        return "Default 2 !!!";
    }
}
