package com.codechef;

import java.util.Scanner;

public class Rupsa {

	private static final long mod = 1000000007;
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int T = keyboard.nextInt();
 
        long answer = 0, innerSum = 0, curA = 0, curExp = 0;
 
        for(int i = 0; i < T; i++){
            int N = keyboard.nextInt();
 
            answer = 0;
            innerSum = 0;
            curA = 0;
            curExp = 1;
 
            if(N > 0)
            {
                curA = keyboard.nextInt();
 
                answer += (curA * innerSum);
                answer = (answer * 2) % mod;
                innerSum = (innerSum + curExp * curA) % mod;
            }
            for(int j = 1; j <= N; j++)
            {
                curA = keyboard.nextInt();
 
                answer += (curA * innerSum);
                answer = (answer * 2) % mod;
                innerSum = (innerSum + curExp * curA) % mod;
                curExp = (curExp * 2) % mod;
            }
 
            System.out.println(answer);
 
        }

        keyboard.close();
    }

}
