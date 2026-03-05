/**
 * ARMSTRONG NUMBER
 * DIFFICULTY: EASY
 * 
 * TOPICS: Math, Number Theory
 * 
 * PROBLEM: Check if number equals sum of its digits raised to power of digit count.
 * 
 * EXAMPLE:
 * Input: n = 153
 * Output: true
 * Explanation: 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153
 * 
 * APPROACH: Count digits, then sum each digit raised to that power.
 * 
 * TIME: O(log n), SPACE: O(1)
 */

public class ArmstrongNumber {
    
    public boolean isArmstrong(int n) {
        int original = n;
        int digits = String.valueOf(n).length();
        int sum = 0;
        
        while (n > 0) {
            int digit = n % 10;
            sum += Math.pow(digit, digits);
            n /= 10;
        }
        
        return sum == original;
    }
    
    public static void main(String[] args) {
        ArmstrongNumber solution = new ArmstrongNumber();
        System.out.println("Test 1: " + solution.isArmstrong(153)); // Expected: true
        System.out.println("Test 2: " + solution.isArmstrong(123)); // Expected: false
    }
}
