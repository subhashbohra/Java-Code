/**
 * CLIMBING STAIRS
 * DIFFICULTY: EASY
 * 
 * TOPICS: Dynamic Programming, Math
 * 
 * PROBLEM: Count ways to climb n stairs (1 or 2 steps at a time).
 * 
 * EXAMPLE:
 * Input: n = 3
 * Output: 3
 * 
 * TIME: O(n), SPACE: O(1)
 */

public class ClimbingStairs {
    
    public int climbStairs(int n) {
        if (n <= 2) return n;
        
        int prev2 = 1, prev1 = 2;
        
        for (int i = 3; i <= n; i++) {
            int current = prev1 + prev2;
            prev2 = prev1;
            prev1 = current;
        }
        
        return prev1;
    }
    
    public static void main(String[] args) {
        ClimbingStairs solution = new ClimbingStairs();
        System.out.println("Test 1: " + solution.climbStairs(2));
        System.out.println("Test 2: " + solution.climbStairs(3));
        System.out.println("Test 3: " + solution.climbStairs(5));
    }
}
