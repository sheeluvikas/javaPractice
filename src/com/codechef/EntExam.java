/**
 * https://www.codechef.com/problems/ENTEXAM
 */

package com.codechef;
import java.util.Arrays;
import java.util.Scanner;

class EntExam {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		short T = sc.nextShort();
		if(T < 1){
			System.out.println("Impossible");
		}
		for(short i = 0; i < T; i++){
			short N = sc.nextShort();
			short K = sc.nextShort();
			byte E = sc.nextByte();
			long M = sc.nextInt();
			long sum[] = new long[N-1];
			long hisMarks = 0;
			for(short j = 0; j < N-1; j++){
				long add = 0;
				for(byte k = 0; k < E; k ++){
					
					add = add + sc.nextLong();
				}
				
				sum[j] = add;
			}
			for(byte m = 0; m < E-1; m++){
				hisMarks = hisMarks + sc.nextLong();
			}
			Arrays.sort(sum);
			if(sum[N-K-1]+1 - hisMarks > M){
				System.out.println("Impossible");
			}
			else if(sum[N-K-1]+1 - hisMarks <= 0){
				System.out.println(0);
			}
			else {
				System.out.println(sum[N-K-1]+1 - hisMarks);
			}
		}
		sc.close();
	
	}
}
