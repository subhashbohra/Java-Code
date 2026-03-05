/**
 * HAPPY NUMBER
 * DIFFICULTY: EASY
 * 
 * TOPICS: Math, HashSet, Cycle Detection
 * 
 * PROBLEM: A happy number is defined by repeatedly replacing with sum of squares of digits
 * until it equals 1 (happy) or loops endlessly (not happy).
 * 
 * EXAMPLE:
 * Input: n = 19
 * Output: true
 * Explanation: 1^2 + 9^2 = 82, 8^2 + 2^2 = 68, 6^2 + 8^2 = 100, 1^2 + 0^2 + 0^2 = 1
 * 
 * APPROACH: Use HashSet to detect cycles.
 * 
 * TIME: O(log n), SPACE: O(log n)
 */

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    
    public boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();
        
        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            n = getSumOfSquares(n);
        }
        
        return n == 1;
    }
    
    private int getSumOfSquares(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }
    
    public static void main(String[] args) {
        HappyNumber solution = new HappyNumber();
        System.out.println("Test 1: " + solution.isHappy(19)); // Expected: true
        System.out.println("Test 2: " + solution.isHappy(2)); // Expected: false
    }
}
