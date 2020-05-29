package com.practice.strings;

public class StringLiteralDemo {

    public static void main(String[] args) {
        String a = "vikas";
        String b = "vikas";
        String c = new String("vikas");

        System.out.println(a == b);
        System.out.println(a == c);

        a = null;
        a = "vikas";
        System.out.println(a == b);

        StringBuilder d = new StringBuilder("vikas");
        d.append(1);
        System.out.println(d);
    }
}
