/**
 * MARK ELEMENTS ON ARRAY BY PERFORMING QUERIES
 * 
 * TOPICS: Array, Simulation, HashSet
 * 
 * PROBLEM: Mark elements and their neighbors based on queries.
 * 
 * APPROACH: Use HashSet to track marked indices.
 * 
 * TIME: O(n + q), SPACE: O(n)
 */

import java.util.HashSet;
import java.util.Set;

public class MarkElements {
    
    public long[] unmarkedSumArray(int[] nums, int[][] queries) {
        Set<Integer> marked = new HashSet<>();
        long[] result = new long[queries.length];
        
        for (int i = 0; i < queries.length; i++) {
            int index = queries[i][0];
            int k = queries[i][1];
            
            marked.add(index);
            if (index > 0) marked.add(index - 1);
            if (index < nums.length - 1) marked.add(index + 1);
            
            long sum = 0;
            for (int j = 0; j < nums.length; j++) {
                if (!marked.contains(j)) sum += nums[j];
            }
            result[i] = sum;
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        MarkElements solution = new MarkElements();
        int[] nums = {1,2,3,4,5};
        int[][] queries = {{1,2},{3,1}};
        long[] result = solution.unmarkedSumArray(nums, queries);
        System.out.print("Test: ");
        for (long val : result) System.out.print(val + " ");
    }
}
