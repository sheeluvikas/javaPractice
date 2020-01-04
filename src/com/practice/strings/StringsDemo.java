package com.practice.strings;

import java.lang.ref.WeakReference;

public class StringsDemo {

    public static void main(String[] args) {
        String s1 = "Vikas";
        String s2 = new String("Vikas");

        System.out.println(s1 == s2);

        WeakReference<String> s3 = new WeakReference<String>(new String("Katiyar"));
        System.out.println(s3.get());
        System.gc();
        System.out.println(s3.get());
    }
}
