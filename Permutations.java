/**
 * PERMUTATIONS
 * DIFFICULTY: MEDIUM
 * 
 * TOPICS: Backtracking
 * 
 * PROBLEM: Return all possible permutations.
 * 
 * EXAMPLE:
 * Input: nums = [1,2,3]
 * Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
 * 
 * TIME: O(n!*n), SPACE: O(n)
 */

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), nums);
        return result;
    }
    
    private void backtrack(List<List<Integer>> result, List<Integer> current, int[] nums) {
        if (current.size() == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }
        
        for (int num : nums) {
            if (current.contains(num)) continue;
            current.add(num);
            backtrack(result, current, nums);
            current.remove(current.size() - 1);
        }
    }
    
    public static void main(String[] args) {
        Permutations solution = new Permutations();
        int[] nums = {1, 2, 3};
        System.out.println("Test: " + solution.permute(nums));
    }
}
