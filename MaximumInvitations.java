/**
 * MAXIMUM EMPLOYEES TO BE INVITED TO A MEETING
 * 
 * TOPICS: Graph, DFS, Cycle Detection
 * 
 * PROBLEM: Find max employees that can sit at round table with preferences.
 * 
 * APPROACH: Find cycles and chains in directed graph.
 * 
 * TIME: O(n), SPACE: O(n)
 */

public class MaximumInvitations {
    
    public int maximumInvitations(int[] favorite) {
        int n = favorite.length;
        int[] inDegree = new int[n];
        
        for (int fav : favorite) inDegree[fav]++;
        
        int[] depth = new int[n];
        boolean[] visited = new boolean[n];
        
        for (int i = 0; i < n; i++) {
            if (inDegree[i] == 0) {
                dfs(i, favorite, depth, visited, 1);
            }
        }
        
        int maxCycle = 0, sumChains = 0;
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                int len = getCycleLength(i, favorite, visited);
                if (len == 2) {
                    sumChains += 2 + depth[i] + depth[favorite[i]];
                } else {
                    maxCycle = Math.max(maxCycle, len);
                }
            }
        }
        
        return Math.max(maxCycle, sumChains);
    }
    
    private void dfs(int node, int[] favorite, int[] depth, boolean[] visited, int d) {
        visited[node] = true;
        int next = favorite[node];
        if (!visited[next]) {
            depth[next] = Math.max(depth[next], d);
            dfs(next, favorite, depth, visited, d + 1);
        }
    }
    
    private int getCycleLength(int start, int[] favorite, boolean[] visited) {
        int len = 0, curr = start;
        while (!visited[curr]) {
            visited[curr] = true;
            curr = favorite[curr];
            len++;
        }
        return len;
    }
    
    public static void main(String[] args) {
        MaximumInvitations solution = new MaximumInvitations();
        int[] favorite = {2,2,1,2};
        System.out.println("Test: " + solution.maximumInvitations(favorite));
    }
}
