package graph;
/**
 * https://leetcode.com/problems/keys-and-rooms/submissions/
 *
 */

import java.util.*;

public class KeysAndRooms {

    public static void main(String[] args) {
        KeysAndRooms keysAndRooms = new KeysAndRooms();

        List<List<Integer>> rooms = new ArrayList<>();
        rooms.add(Arrays.asList(1, 3));
        rooms.add(Arrays.asList(3, 0, 1));
        rooms.add(Arrays.asList(2));
        rooms.add(Arrays.asList(0));

        System.out.println(keysAndRooms.canVisitAllRooms(rooms));
    }

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] visited = new boolean[rooms.size()];
        visited[0] = true;

        Map<Integer, List<Integer>> graph = new HashMap<>();
        for (int i = 0; i < rooms.size(); i++) {
            graph.put(i, rooms.get(i));
        }

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(0);
        visited[0] = true;

        while (!queue.isEmpty()){
            for (int i = 0; i < queue.size(); i++) {
                Integer key = queue.poll();
                List<Integer> keys = graph.get(key);
                for (int j = 0; j < keys.size(); j++) {
                    if(!visited[keys.get(j)]) {
                        queue.offer(keys.get(j));
                        visited[keys.get(j)] = true;
                    }
                }

            }
        }

        for (int i = 0; i < visited.length; i++) {
            if(!visited[i]){
                return false;
            }
        }

        return true;
    }
}
