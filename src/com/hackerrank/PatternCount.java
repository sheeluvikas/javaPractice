package com.hackerrank;

import java.util.Scanner;

public class PatternCount {
	
	 static int patternCount(String s){
		 
		 int flag = 0;
		 int count = 0;
		 char[] s1 = s.toCharArray();
		 for(int k = 0; k < s1.length; k++){
			 
			 if(s1[k] == '1'){
				 if(flag == 2){
					 count = count + 1;
				 }
				 flag = 1;
			 }
			 else if(s1[k] == '0'){
				 if(flag == 1){
					 flag = 2;
				 }
			 }
			 else flag = 0;
		 }
		 return count;
	 }

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int q = in.nextInt();
	        for(int a0 = 0; a0 < q; a0++){
	            String s = in.next();
	            int result = patternCount(s);
	            System.out.println(result);
	        }
	    }
	
}
