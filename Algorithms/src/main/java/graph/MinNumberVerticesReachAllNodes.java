package graph;

/**
 * https://leetcode.com/problems/minimum-number-of-vertices-to-reach-all-nodes/
 *
 */

import java.util.*;

public class MinNumberVerticesReachAllNodes {

    public static void main(String[] args) {
        MinNumberVerticesReachAllNodes nodes = new MinNumberVerticesReachAllNodes();
        List<List<Integer>> list = new ArrayList<>();
        list.add(Arrays.asList(0, 1));
        list.add(Arrays.asList(0, 2));
        list.add(Arrays.asList(2, 5));
        list.add(Arrays.asList(3, 4));
        list.add(Arrays.asList(4, 2));

        nodes.findSmallestSetOfVertices(6, list);
    }

    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {

        Map<Integer, List<Integer>> graph = new HashMap<>();

        for (int i = 0; i < n ; i++) {
            graph.putIfAbsent(i, new ArrayList<>());
            List<Integer> reachableList = graph.get(i);
            reachableList.add(i);
            graph.put(i, reachableList);
        }

        for(List<Integer> list : edges){
            int key = list.get(0);
            int value = list.get(1);
            graph.putIfAbsent(value, new ArrayList<>());
            List<Integer> reachableList = graph.get(value);
            reachableList.add(key);
            graph.put(value, reachableList);
        }


        List<Integer> out = new ArrayList<>();
        for(Map.Entry<Integer, List<Integer>> entry : graph.entrySet()){
            if(entry.getValue().size() == 1){
                out.add(entry.getKey());
                continue;
            }
        }

        return out;
    }
}
