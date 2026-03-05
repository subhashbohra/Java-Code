/**
 * TRAILING ZEROES IN FACTORIAL
 * DIFFICULTY: MEDIUM
 * 
 * TOPICS: Math, Number Theory
 * 
 * PROBLEM: Count trailing zeroes in n!
 * 
 * EXAMPLE:
 * Input: n = 5
 * Output: 1
 * Explanation: 5! = 120, has 1 trailing zero
 * 
 * APPROACH: Count factors of 5 (since 2s are abundant).
 * Divide n by 5, 25, 125... and sum.
 * 
 * TIME: O(log n), SPACE: O(1)
 */

public class TrailingZeroes {
    
    public int trailingZeroes(int n) {
        int count = 0;
        
        while (n > 0) {
            n /= 5;
            count += n;
        }
        
        return count;
    }
    
    public static void main(String[] args) {
        TrailingZeroes solution = new TrailingZeroes();
        System.out.println("Test 1: " + solution.trailingZeroes(5)); // Expected: 1
        System.out.println("Test 2: " + solution.trailingZeroes(25)); // Expected: 6
    }
}
