package com.practice.patterns;

/**
 * This class explains how to write a Builder Pattern.
 *
 * https://dzone.com/articles/the-builder-pattern-for-class-with-many-constructo
 * https://dzone.com/articles/creational-design-patterns-builder-pattern
 *
 */
public class BuilderPatternDemo {

    public static void main(String[] args) {

        String emailString = new Email.EmailBuilder()
                .setBody("This is email body.")
                .setSubject("This is email Subject")
                .setRecipient("vikaskatiyar@live.com")
                .setTitle("First Email").build().send();

        System.out.println(emailString);
    }
}
