/**
 * SUM OF DIGITS
 * DIFFICULTY: EASY
 * 
 * TOPICS: Math, Integer Manipulation
 * 
 * PROBLEM: Find sum of all digits in a number.
 * 
 * EXAMPLE:
 * Input: n = 1234
 * Output: 10 (1+2+3+4)
 * 
 * APPROACH: Extract each digit using modulo, add to sum.
 * 
 * TIME: O(log n), SPACE: O(1)
 */

public class SumOfDigits {
    
    public int sumDigits(int n) {
        int sum = 0;
        n = Math.abs(n);
        
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        
        return sum;
    }
    
    public static void main(String[] args) {
        SumOfDigits solution = new SumOfDigits();
        System.out.println("Test 1: " + solution.sumDigits(1234)); // Expected: 10
        System.out.println("Test 2: " + solution.sumDigits(999)); // Expected: 27
    }
}
