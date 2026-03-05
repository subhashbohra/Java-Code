/**
 * ROTATE ARRAY
 * DIFFICULTY: MEDIUM
 * 
 * TOPICS: Array
 * 
 * PROBLEM: Rotate array to right by k steps.
 * 
 * EXAMPLE:
 * Input: nums = [1,2,3,4,5,6,7], k = 3
 * Output: [5,6,7,1,2,3,4]
 * 
 * TIME: O(n), SPACE: O(1)
 */

public class RotateArray {
    
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        System.out.println("length of array: " + n);

        k = k % n;
        System.out.println("value of k after modulo: " + k);
        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
        
    }
    
    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
    
    public static void main(String[] args) {
        RotateArray solution = new RotateArray();
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        solution.rotate(nums, 3);
        System.out.print("Test: ");
        for (int num : nums) System.out.print(num + " ");
    }
}
