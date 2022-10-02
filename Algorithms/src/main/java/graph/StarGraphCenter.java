package graph;

import com.sun.javafx.image.IntPixelGetter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StarGraphCenter {

    public static void main(String[] args) {
        StarGraphCenter graphCenter = new StarGraphCenter();
        int[][] edges = {
                {1, 2},
                {5, 1},
                {1, 3},
                {1, 4}
        };

        System.out.println(graphCenter.findCenter(edges));
    }

    public int findCenter(int[][] edges) {

        Map<Integer, List<Integer>> graph = new HashMap<>();

        for(int[] edge : edges){
            graph.putIfAbsent(edge[0], new ArrayList<>());
            graph.putIfAbsent(edge[1], new ArrayList<>());
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }

        for(Map.Entry<Integer, List<Integer>> entry : graph.entrySet()){
            if(entry.getValue().size() == graph.size() - 1){
                return entry.getKey();
            }
        }

        return -1;
    }
}
