package graph;


import java.util.*;

public class AllGraphPath {

    public static void main(String[] args) {
        AllGraphPath graphPath = new AllGraphPath();
        int[][] graph = {
                {4, 3, 1},
                {3, 2, 4},
                {3},
                {4},
                {}
        };
        System.out.println(graphPath.allPathsSourceTarget(graph));
    }

    public List<List<Integer>> allPathsSourceTarget(int[][] edges) {

        Map<Integer, List<Integer>> graph = new HashMap<>();
        int max = 0;
        for (int i = 0; i < edges.length; i++) {
            for (int j = 0; j < edges[i].length; j++) {
                graph.putIfAbsent(i, new ArrayList<>());
                graph.get(i).add(edges[i][j]);
                if(edges[i][j] > max){
                    max = edges[i][j];
                }
            }
        }

        List<List<Integer>> output = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        output.add(new ArrayList<>());

        int index = 0;

        while(!stack.isEmpty()){
            for (int i = 0; i < stack.size(); i++) {
                int value = stack.pop();
                output.get(index).add(value);
                if(value == max){
                    output.add(new ArrayList<>());
                    index = index + 1;
                    output.get(index).add(0);
                }
                List<Integer> options = graph.get(value);
                if(options == null){
                    continue;
                }
                for (int j = 0; j < options.size(); j++) {
                    stack.push(options.get(j));
                }
            }
        }

        System.out.println(output);
        return null;
    }
}
