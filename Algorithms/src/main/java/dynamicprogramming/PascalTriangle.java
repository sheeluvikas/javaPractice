package dynamicprogramming;

/**
 * https://leetcode.com/problems/pascals-triangle/
 *
 * Given an integer numRows, return the first numRows of Pascal's triangle.
 *
 * In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:
 *
 *
 *
 *
 * Example 1:
 *
 * Input: numRows = 5
 * Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
 * Example 2:
 *
 * Input: numRows = 1
 * Output: [[1]]
 *
 * Constraints:
 *
 * 1 <= numRows <= 30
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PascalTriangle {

    Map<Integer, List<List<Integer>>> outMap = new HashMap<>();
    List<List<Integer>> outList = new ArrayList<>();

    public static void main(String[] args) {
        PascalTriangle triangle = new PascalTriangle();
        System.out.println(triangle.generate(5));
    }

    public List<List<Integer>> generate(int numRows) {
        if(outMap.containsKey(numRows)){
            return outMap.get(numRows);
        }

         if(numRows == 1){
             List<Integer> list = new ArrayList<>();
             list.add(1);
             if(!outMap.containsKey(1)) {
                 outList.add(list);
                 outMap.put(1, outList);
             }
         }
         else if(numRows == 2){
             List<Integer> list = new ArrayList<>();
             list.add(1);
             list.add(generate(1).get(0).get(0));
             if(!outMap.containsKey(2)) {
                 outList.add(list);
                 outMap.put(2, outList);
             }

         }
         else {
             List<Integer> list = new ArrayList<>();
             list.add(1);
             for (int i = 1; i < numRows - 1; i++) {
                 List<List<Integer>> tempList = generate(numRows - 1);
                 List<Integer> prevList = tempList.get(numRows - 2);
                 int sum = prevList.get(i - 1) + prevList.get(i);
                 list.add(sum);
             }
             list.add(1);
             if(!outMap.containsKey(numRows)) {
                 outList.add(list);
                 outMap.put(numRows, outList);
             }
         }

         return outList;
    }
}
