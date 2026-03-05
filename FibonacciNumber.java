/**
 * FIBONACCI NUMBER
 * DIFFICULTY: EASY
 * 
 * TOPICS: Math, Dynamic Programming
 * 
 * PROBLEM: Calculate nth Fibonacci number.
 * 
 * EXAMPLE:
 * Input: n = 4
 * Output: 3
 * 
 * TIME: O(n), SPACE: O(1)
 */

public class FibonacciNumber {
    
    public int fib(int n) {
        if (n <= 1) return n;
        
        int prev2 = 0, prev1 = 1;
        
        for (int i = 2; i <= n; i++) {
            int current = prev1 + prev2;
            prev2 = prev1;
            prev1 = current;
        }
        
        return prev1;
    }
    
    public static void main(String[] args) {
        FibonacciNumber solution = new FibonacciNumber();
        System.out.println("Test 1: " + solution.fib(4));
        System.out.println("Test 2: " + solution.fib(10));
    }
}
