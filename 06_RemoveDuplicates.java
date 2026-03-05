/**
 * REMOVE DUPLICATES FROM SORTED ARRAY
 * DIFFICULTY: EASY
 * 
 * TOPICS: Array, Two Pointers
 * 
 * PROBLEM: Remove duplicates in-place from sorted array.
 * 
 * EXAMPLE:
 * Input: nums = [1,1,2]
 * Output: 2, nums = [1,2,_]
 * 
 * TIME: O(n), SPACE: O(1)
 */

public class RemoveDuplicates {
    
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        
        return i + 1;
    }
    
    public static void main(String[] args) {
        RemoveDuplicates solution = new RemoveDuplicates();
        int[] nums = {1, 1, 2};
        int len = solution.removeDuplicates(nums);
        System.out.print("Test: Length=" + len + ", Array=");
        for (int i = 0; i < len; i++) System.out.print(nums[i] + " ");
    }
}
