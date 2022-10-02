package graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TownJudge {

    public static void main(String[] args) {
        TownJudge townJudge = new TownJudge();

        int[][] trust = {
                {1, 2},
                {2, 3}
        };

        System.out.println(townJudge.findJudge(3, trust));

    }

    public int findJudge(int n, int[][] trust) {

        Map<Integer, List<Integer>> graph = new HashMap<>();

        Map<Integer, List<Integer>> trustCount = new HashMap<>();

        if(trust.length == 0 && n == 1){
            return 1;
        }
        if(trust.length == 0 && n > 1){
            return -1;
        }
        for(int[] t : trust){
            graph.putIfAbsent(t[0], new ArrayList<>());
            graph.putIfAbsent(t[1], new ArrayList<>());
            graph.get(t[0]).add(t[1]);
            trustCount.putIfAbsent(t[1], new ArrayList<>());
            trustCount.get(t[1]).add(t[0]);
        }

        for(Map.Entry<Integer, List<Integer>> entry : graph.entrySet()){

            if(entry.getValue().isEmpty() && trustCount.get(entry.getKey()).size() == (n-1)){
                return entry.getKey();
            }
        }

        return -1;
    }
}
