package com.hackerearth;
/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;
*/
import java.util.*;
class MagicLand {
    public static void main(String args[] ) throws Exception {
        
        Scanner s = new Scanner(System.in);
        int testCases = s.nextInt();
        for(int i = 0; i < testCases; i ++){
            
            int rows = s.nextInt();
            int columns = s.nextInt();
            int arr[][] = new int[rows][columns];
            for(int j = 0; j < rows; j ++){
                for(int k = 0; k < columns; k++){
                    arr[j][k] = s.nextInt();
                }
            }
            int Mrow = 0;
            int Mcolumn = 0;
            int maxMrow = 0;
            int maxMcolumn = 0;
            for(int j = 0; j < rows; j ++){
                int previous = 0;
                for(int k = 0; k < columns ; k ++){
                    if(arr[j][k] == previous){
                        Mrow = Mrow + 1;
                    }
                    else {
                        Mrow = 1;
                    }
                    if(maxMrow < Mrow){
                        maxMrow = Mrow;
                    }
                    previous = arr[j][k];
                }
            }
            for(int j = 0; j < rows; j ++){
                int previous = 0;
                for(int k = 0; k < columns ; k ++){
                    if(arr[k][j] == previous){
                        Mcolumn = Mcolumn + 1;
                    }
                    else {
                        Mcolumn = 1;
                    }
                    if(maxMcolumn < Mcolumn){
                        maxMcolumn = Mcolumn;
                    }
                    previous = arr[k][j];
                }
            }
            
            System.out.println(maxMcolumn*maxMrow);
        }
        
        
        /*
         * Read input from stdin and provide input before running
         * Use either of these methods for input

        //Scanner
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();

        for (int i = 0; i < N; i++) {
            System.out.println("hello world");
        }
        */

    }
}




