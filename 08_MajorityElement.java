/**
 * MAJORITY ELEMENT
 * DIFFICULTY: EASY
 * 
 * TOPICS: Array, Boyer-Moore Voting
 * 
 * PROBLEM: Find element appearing more than n/2 times.
 * 
 * EXAMPLE:
 * Input: nums = [3,2,3]
 * Output: 3
 * 
 * TIME: O(n), SPACE: O(1)
 */

public class MajorityElement {
    
    public int majorityElement(int[] nums) {
        int candidate = 0, count = 0;
        
        for (int num : nums) {
            if (count == 0) candidate = num;
            count += (num == candidate) ? 1 : -1;
        }
        
        return candidate;
    }
    
    public static void main(String[] args) {
        MajorityElement solution = new MajorityElement();
        int[] nums1 = {3, 2, 3};
        System.out.println("Test 1: " + solution.majorityElement(nums1));
        
        int[] nums2 = {2, 2, 1, 1, 1, 2, 2};
        System.out.println("Test 2: " + solution.majorityElement(nums2));
    }
}
