package com.hackerearth.codearena;

import java.io.IOException;
import java.util.Scanner;

public class TestClass {

    public static void main(String[] args) throws IOException {

        Scanner s = new Scanner(System.in);
        String count = s.nextLine();                 // Reading input from STDIN

        for(int i = 0; i < Integer.parseInt(count); i++){

            String value = s.nextLine();
            long n = Long.parseLong(value);
            int c = 0;
            for(long k = 1; k <= n; k++){
                boolean flag = false;

                if(gcd(n, k) == 1) {
                    c++;
                }
            }
            System.out.println(c);
        }

    }

    static long gcd(long a, long b)
    {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
}
