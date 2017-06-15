package com.patterns;

public class Pattern1 {

	public static void main(String[] args) {
		
		int i = 1;
		int flag = 0;
		while( i <= 7){
			
			for(int j = 1; j <= i; j ++){
				System.out.print(j);
			}
			System.out.println();
			if(i == 7){
				flag = 1;
			}
			if ( flag == 1){
				i = i -1;
			}
			else {
				i = i + 1;
			}
			if(i < 1){
				break;
			}
		}
	}

}
