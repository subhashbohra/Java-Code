/**
 * CONTAINS DUPLICATE
 * DIFFICULTY: EASY
 * 
 * TOPICS: Array, HashSet
 * 
 * PROBLEM: Check if array contains any duplicates.
 * 
 * EXAMPLE:
 * Input: nums = [1,2,3,1]
 * Output: true
 * 
 * TIME: O(n), SPACE: O(n)
 */

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        
        for (int num : nums) {
            if (seen.contains(num)) {
                return true;
            }
            seen.add(num);
        }
        
        return false;
    }
    
    public static void main(String[] args) {
        ContainsDuplicate solution = new ContainsDuplicate();
        int[] nums1 = {1, 2, 3, 1};
        System.out.println("Test 1: " + solution.containsDuplicate(nums1));
        
        int[] nums2 = {1, 2, 3, 4};
        System.out.println("Test 2: " + solution.containsDuplicate(nums2));
    }
}
