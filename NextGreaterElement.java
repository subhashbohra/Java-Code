/**
 * NEXT GREATER ELEMENT I
 * DIFFICULTY: MEDIUM
 * 
 * TOPICS: Stack, Hash Map
 * 
 * PROBLEM: Find next greater element for each element.
 * 
 * EXAMPLE:
 * Input: nums1 = [4,1,2], nums2 = [1,3,4,2]
 * Output: [-1,3,-1]
 * 
 * TIME: O(n+m), SPACE: O(n)
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterElement {
    
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        
        for (int num : nums2) {
            while (!stack.isEmpty() && stack.peek() < num) {
                map.put(stack.pop(), num);
            }
            stack.push(num);
        }
        
        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            result[i] = map.getOrDefault(nums1[i], -1);
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        NextGreaterElement solution = new NextGreaterElement();
        int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 3, 4, 2};
        int[] result = solution.nextGreaterElement(nums1, nums2);
        System.out.print("Test: ");
        for (int num : result) System.out.print(num + " ");
    }
}
