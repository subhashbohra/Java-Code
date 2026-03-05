/**
 * MISSING NUMBER
 * DIFFICULTY: EASY
 * 
 * TOPICS: Math, Array, Bit Manipulation
 * 
 * PROBLEM: Find missing number in array containing n distinct numbers from 0 to n.
 * 
 * EXAMPLE:
 * Input: nums = [3,0,1]
 * Output: 2
 * 
 * APPROACH: Use sum formula n*(n+1)/2, subtract array sum.
 * 
 * TIME: O(n), SPACE: O(1)
 */

public class MissingNumber {
    
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        
        for (int num : nums) {
            actualSum += num;
        }
        
        return expectedSum - actualSum;
    }
    
    public static void main(String[] args) {
        MissingNumber solution = new MissingNumber();
        int[] nums1 = {3, 0, 1};
        System.out.println("Test 1: " + solution.missingNumber(nums1)); // Expected: 2
        
        int[] nums2 = {9,6,4,2,3,5,7,0,1};
        System.out.println("Test 2: " + solution.missingNumber(nums2)); // Expected: 8
    }
}
