/**
 * POWER OF NUMBER
 * DIFFICULTY: MEDIUM
 * 
 * TOPICS: Math, Recursion
 * 
 * PROBLEM: Calculate x^n.
 * 
 * EXAMPLE:
 * Input: x = 2, n = 10
 * Output: 1024
 * 
 * TIME: O(log n), SPACE: O(log n)
 */

public class PowerOfNumber {
    
    public double myPow(double x, int n) {
        if (n == 0) return 1;
        if (n == Integer.MIN_VALUE) {
            return myPow(x, n + 1) / x;
        }
        if (n < 0) {
            x = 1 / x;
            n = -n;
        }
        return powHelper(x, n);
    }
    
    private double powHelper(double x, int n) {
        if (n == 0) return 1;
        
        double half = powHelper(x, n / 2);
        
        if (n % 2 == 0) {
            return half * half;
        } else {
            return half * half * x;
        }
    }
    
    public static void main(String[] args) {
        PowerOfNumber solution = new PowerOfNumber();
        System.out.println("Test 1: " + solution.myPow(2, 10));
        System.out.println("Test 2: " + solution.myPow(2, -2));
    }
}
