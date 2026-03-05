/**
 * UGLY NUMBER
 * DIFFICULTY: EASY
 * 
 * TOPICS: Math, Number Theory
 * 
 * PROBLEM: Ugly numbers are positive numbers whose prime factors only include 2, 3, 5.
 * 
 * EXAMPLE:
 * Input: n = 6
 * Output: true
 * Explanation: 6 = 2 x 3
 * 
 * Input: n = 14
 * Output: false
 * Explanation: 14 = 2 x 7 (7 is not allowed)
 * 
 * APPROACH: Divide by 2, 3, 5 repeatedly. If result is 1, it's ugly.
 * 
 * TIME: O(log n), SPACE: O(1)
 */

public class UglyNumber {
    
    public boolean isUgly(int n) {
        if (n <= 0) return false;
        
        while (n % 2 == 0) n /= 2;
        while (n % 3 == 0) n /= 3;
        while (n % 5 == 0) n /= 5;
        
        return n == 1;
    }
    
    public static void main(String[] args) {
        UglyNumber solution = new UglyNumber();
        System.out.println("Test 1: " + solution.isUgly(6)); // Expected: true
        System.out.println("Test 2: " + solution.isUgly(14)); // Expected: false
    }
}
