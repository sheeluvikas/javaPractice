package graph;

import java.util.*;

public class RedundantConnection {

    public static void main(String[] args) {
        RedundantConnection connection = new RedundantConnection();
        int[][] graph = {
                {1, 2},
                {2, 3},
                {3, 4},
                {1, 4},
                {1, 5}
        };

        int[] out = connection.findRedundantConnection(graph);
        for (int i = 0; i < out.length; i++) {
            System.out.println(out[i]);
        }
    }

    public int[] findRedundantConnection(int[][] edges) {
        boolean [] visited = new boolean[edges.length];
        Map<Integer, Integer> parent = new HashMap<>();
        int[] out = new int[2];

        Map<Integer, List<Integer>> graph = new HashMap<>();

        for (int i = 0; i < edges.length; i++) {
            graph.putIfAbsent(edges[i][0], new ArrayList<>());
            graph.putIfAbsent(edges[i][1], new ArrayList<>());
            graph.get(edges[i][0]).add(edges[i][1]);
            graph.get(edges[i][1]).add(edges[i][0]);
        }

        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        parent.put(1, -1);
        visited[0] = true;

        while (!stack.isEmpty()){
            for (int i = 0; i < graph.size(); i++) {
                Integer node = stack.pop();

                List<Integer> children = graph.get(node);

                for (int j = 0; j < children.size(); j++) {
                    if(visited[children.get(j) - 1] && !parent.get(node).equals(children.get(j))){
                        out[0] = node ;
                        out[1] = children.get(j) ;
                    }
                    if (!visited[children.get(j) - 1]){
                        visited[children.get(j) - 1] = true;
                        stack.push(children.get(j));
                        parent.put(children.get(j), node);
                    }

                }
            }
        }
        return out;
    }
}
