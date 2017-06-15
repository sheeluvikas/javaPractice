package com.hackerrank;

import java.util.Scanner;

public class Duplication {
	
	static String duplication(int x){
		int max = 1001;
		byte[] s = new byte[max];
		s[0] = 0;
		if(x == 0){
			return s[x]+"";
		}
		int size = 1;
		while(size <= max){
			int k = size;
			for(int i = 0 ; i < size; i++){
				if(k < max){
					s[k] = (byte) (1 - s[i]);
					if(k == x){
						return s[k]+"";
					}
					k++;
				}
				else break;
			}
			size = k;
		}
		
		return s[x]+"";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int x = in.nextInt();
            String result = duplication(x);
            System.out.println(result);
        }
    }
}
