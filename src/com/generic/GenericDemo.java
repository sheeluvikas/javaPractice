package com.generic;

import java.util.HashSet;
import java.util.Set;

public class GenericDemo {

	public static void main(String[] args) {
		
		int [][]arr = {{1, 20}, {9, 19}, {20, 27}};
//		arr = {{1, 20}, {9, 19}};
		
		countNumbers(arr);
	}
	
static void countNumbers(int[][] arr) {
        
        for(int i = 0; i < arr.length; i ++){
            int count = 0;
            
                int lower = arr[i][0];
                int upper = arr[i][1];
                while(lower <= upper){
                	if(lower == 19){
                	}
                	int flag = 0;
                    int temp = lower;
                    int previous = -1;
                    while(temp % 10 > 0 || temp /10 >0){
                        if(previous == -1){
                        	flag = 2;
                        	previous = temp % 10;
                        }
                        else {
                        	flag = 0;
                        	if(previous == temp % 10){
                        		temp = temp / 10;
                        		continue;
                        	}
                        	else {
                        		flag = 1;
                        		break;
                        	}
                        }
                        temp = temp / 10;
                    }
                    if(flag == 1 || flag == 2){
                        count = count + 1;
                    }
                    lower = lower + 1;
            }
            System.out.println(count);
        }

    }
}
