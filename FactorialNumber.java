/**
 * FACTORIAL NUMBER
 * DIFFICULTY: EASY
 * 
 * TOPICS: Math
 * 
 * PROBLEM: Calculate factorial of n.
 * 
 * EXAMPLE:
 * Input: n = 5
 * Output: 120
 * 
 * TIME: O(n), SPACE: O(1)
 */

public class FactorialNumber {
    
    public long factorial(int n) {
        if (n < 0) return -1;
        if (n <= 1) return 1;
        
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        FactorialNumber solution = new FactorialNumber();
        System.out.println("Test 1: " + solution.factorial(5));
        System.out.println("Test 2: " + solution.factorial(10));
    }
}
