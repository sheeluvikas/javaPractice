package com.leetcode.easy;

import static com.Utils.print2DArray;

/**
 * Given an n x n binary matrix image, flip the image horizontally, then invert it, and return the resulting image.
 *
 * To flip an image horizontally means that each row of the image is reversed.
 *
 * For example, flipping [1,1,0] horizontally results in [0,1,1].
 * To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0.
 *
 * For example, inverting [0,1,1] results in [1,0,0].
 *
 *
 * Example 1:
 *
 * Input: image = [[1,1,0],[1,0,1],[0,0,0]]
 * Output: [[1,0,0],[0,1,0],[1,1,1]]
 * Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
 * Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]
 * Example 2:
 *
 * Input: image = [[1,1,0,0],[1,0,0,1],[0,1,1,1],[1,0,1,0]]
 * Output: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
 * Explanation: First reverse each row: [[0,0,1,1],[1,0,0,1],[1,1,1,0],[0,1,0,1]].
 * Then invert the image: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
 *
 *
 * Constraints:
 *
 * n == image.length
 * n == image[i].length
 * 1 <= n <= 20
 * images[i][j] is either 0 or 1.
 */
public class FlipInvertImage {

    public static void main(String[] args) {

        int[][] image = new int[2][2];
        image[0][0] = 1;
        image[0][1] = 0;
        image[1][0] = 0;
        image[1][1] = 1;
        print2DArray(image);
        System.out.println("***********");
        print2DArray(flipAndInvertImage(image));

    }
    public static int[][] flipAndInvertImage(int[][] image) {

        for(int i = 0; i < image[0].length; i++){
            int[] arr = image[i];
            for(int j = 0; j < arr.length/2; j++){
                int tmp = arr[arr.length -1 - j];
                arr[arr.length -1 - j] = arr[j];
                arr[j] = tmp;
            }
        }

        for(int i = 0; i < image[0].length; i++){
            int[] arr1 = image[i];
            for(int j = 0; j < arr1.length; j++){
                if(arr1[j] == 0){
                    arr1[j] = 1;
                }
                else {
                    arr1[j] = 0;
                }
            }
        }
        return image;
    }
}
