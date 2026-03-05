/**
 * TWO SUM
 * DIFFICULTY: EASY
 * 
 * TOPICS: Array, Hash Map
 * 
 * PROBLEM: Find two numbers that add up to target.
 * 
 * EXAMPLE:
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * 
 * TIME: O(n), SPACE: O(n)
 */

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        
        return new int[] {};
    }
    
    public static void main(String[] args) {
        TwoSum solution = new TwoSum();
        int[] nums = {2, 7, 0, 9};
        int[] result = solution.twoSum(nums, 9);
        System.out.println("***********");
        System.out.println("Test: [" + result[0] + ", " + result[1] + "]");
        System.out.println("***********");

    }
}
