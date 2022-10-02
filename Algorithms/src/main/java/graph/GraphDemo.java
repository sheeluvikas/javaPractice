package graph;

import java.util.*;

public class GraphDemo {

    public static void main(String[] args) {
        GraphDemo demo = new GraphDemo();
        int[][] edges = {
                {0, 7},
                {0, 8},
                {6, 1},
                {2, 0},
                {0, 4},
                {5, 8},
                {4, 7},
                {1, 3},
                {3, 5},
                {6, 5},
        };
        System.out.println(demo.validPath(10, edges, 7, 5));
    }

    public boolean validPath(int n, int[][] edges, int source, int destination) {

        Set<Integer> visited = new HashSet<>();

        Map<Integer, List<Integer>> graph = new HashMap<>();
        for(int[] edge : edges){
            graph.putIfAbsent(edge[0], new ArrayList<>());
            graph.putIfAbsent(edge[1], new ArrayList<>());
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(source);

        while(!queue.isEmpty()){
            for (int i = 0; i < queue.size(); i++) {
                int value = queue.poll();
                if(value == destination){
                    return true;
                }
                List<Integer> child = graph.get(value);
                for(Integer way : child){
                    if(!visited.contains(way)){
                        visited.add(way);
                        queue.offer(way);
                    }
                }
            }
        }
        return false;
    }
}


/**
 * List<Integer> options = graph.get(cur);
 *                 for (Integer way : options) {
 *                     if (!visited.contains(way)) {
 *                         visited.add(way);
 *                         queue.offer(way);
 *                     }
 *                 }
 */
