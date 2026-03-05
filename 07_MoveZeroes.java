/**
 * MOVE ZEROES
 * DIFFICULTY: EASY
 * 
 * TOPICS: Array, Two Pointers
 * 
 * PROBLEM: Move all zeros to end while maintaining order.
 * 
 * EXAMPLE:
 * Input: nums = [0,1,0,3,12]
 * Output: [1,3,12,0,0]
 * 
 * TIME: O(n), SPACE: O(1)
 */

public class MoveZeroes {
    
    public void moveZeroes(int[] nums) {
        int left = 0;
        
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] != 0) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
            }
        }
    }
    
    public static void main(String[] args) {
        MoveZeroes solution = new MoveZeroes();
        int[] nums = {0, 1, 0, 3, 12};
        solution.moveZeroes(nums);
        System.out.print("Test: ");
        for (int num : nums) System.out.print(num + " ");
    }
}
