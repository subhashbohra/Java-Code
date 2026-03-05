/**
 * PERFECT NUMBER
 * DIFFICULTY: EASY
 * 
 * TOPICS: Math, Number Theory
 * 
 * PROBLEM: Check if number equals sum of its proper divisors (excluding itself).
 * 
 * EXAMPLE:
 * Input: n = 28
 * Output: true
 * Explanation: 1 + 2 + 4 + 7 + 14 = 28
 * 
 * APPROACH: Find all divisors up to sqrt(n), add both divisor and quotient.
 * 
 * TIME: O(sqrt(n)), SPACE: O(1)
 */

public class PerfectNumber {
    
    public boolean checkPerfectNumber(int num) {
        if (num <= 1) return false;
        
        int sum = 1;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                sum += i;
                if (i != num / i) sum += num / i;
            }
        }
        
        return sum == num;
    }
    
    public static void main(String[] args) {
        PerfectNumber solution = new PerfectNumber();
        System.out.println("Test 1: " + solution.checkPerfectNumber(28)); // Expected: true
        System.out.println("Test 2: " + solution.checkPerfectNumber(6)); // Expected: true
    }
}
