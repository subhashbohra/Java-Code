/**
 * MAXIMUM SUBARRAY
 * DIFFICULTY: MEDIUM
 * 
 * TOPICS: Array, Dynamic Programming
 * 
 * PROBLEM: Find contiguous subarray with largest sum.
 * 
 * EXAMPLE:
 * Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
 * Output: 6
 * 
 * TIME: O(n), SPACE: O(1)
 */

public class MaximumSubarray {
    
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currentSum = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        
        return maxSum;
    }
    
    public static void main(String[] args) {
        MaximumSubarray solution = new MaximumSubarray();
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Test: " + solution.maxSubArray(nums));
    }
}
