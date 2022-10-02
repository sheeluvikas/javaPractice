package graph;

/**
 * https://leetcode.com/problems/number-of-provinces/
 *
 */

import java.util.*;

public class NumberOfProvinces {

    public static void main(String[] args) {
        NumberOfProvinces provinces = new NumberOfProvinces();
        int[][] graph = {
                {1, 1, 0},
                {1, 1, 0},
                {0, 0, 1},
        };
        System.out.println(provinces.findCircleNum(graph));
    }

    public int findCircleNum(int[][] isConnected) {

        Map<Integer, List<Integer>> graph = new HashMap<>();

        for (int i = 0; i < isConnected.length; i++) {
            graph.putIfAbsent(i, new ArrayList<>());
            List<Integer> list = graph.get(i);
            for (int j = 0; j < isConnected[i].length; j++) {
                if(isConnected[i][j] == 1){
                    list.add(j);
                }
            }
        }

        boolean[] visited = new boolean[isConnected.length];
        Queue<Integer> queue = new LinkedList<>();


        int count = 0;
        for (int m = 0; m < visited.length; m++) {
            if(visited[m]){
                continue;
            }
            queue.offer(m);
            while (!queue.isEmpty()){
                for (int i = 0; i < queue.size(); i++) {
                    Integer value = queue.poll();
                    List<Integer> children = graph.get(value);

                    for (int j = 0; j < children.size(); j++) {
                        if(!visited[children.get(j)]){
                            queue.offer(children.get(j));
                            visited[children.get(j)] = true;
                        }
                    }
                }
            }
            count++;
        }


        return count;

    }
}