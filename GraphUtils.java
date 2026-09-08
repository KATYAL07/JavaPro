import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class GraphUtils {
    
    public static List<Integer> topologicalSort(int numCourses, int[][] prerequisites) {
        List<Integer> res = new ArrayList<>();
        int[] inDegree = new int[numCourses];
        List<List<Integer>> adj = new ArrayList<>(numCourses);
        
        for (int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList<>());
        }
        
        for (int[] pre : prerequisites) {
            adj.get(pre[1]).add(pre[0]);
            inDegree[pre[0]]++;
        }
        
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (inDegree[i] == 0) {
                queue.offer(i);
            }
        }
        
        while (!queue.isEmpty()) {
            int current = queue.poll();
            res.add(current);
            for (int neighbor : adj.get(current)) {
                inDegree[neighbor]--;
                if (inDegree[neighbor] == 0) {
                    queue.offer(neighbor);
                }
            }
        }
        
        if (res.size() != numCourses) {
            return new ArrayList<>(); 
        }
        return res;
    }
}
