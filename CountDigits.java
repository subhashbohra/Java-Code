/**
 * COUNT DIGITS IN A NUMBER
 * DIFFICULTY: EASY
 * 
 * TOPICS: Math, Integer Manipulation
 * 
 * PROBLEM: Count number of digits in an integer.
 * 
 * EXAMPLE:
 * Input: n = 12345
 * Output: 5
 * 
 * APPROACH: Divide by 10 repeatedly until n becomes 0.
 * 
 * TIME: O(log n), SPACE: O(1)
 */

public class CountDigits {
    
    public int countDigits(int n) {
        if (n == 0) return 1;
        
        int count = 0;
        n = Math.abs(n);
        
        while (n > 0) {
            count++;
            n /= 10;
        }
        
        return count;
    }
    
    public static void main(String[] args) {
        CountDigits solution = new CountDigits();
        System.out.println("Test 1: " + solution.countDigits(12345)); // Expected: 5
        System.out.println("Test 2: " + solution.countDigits(0)); // Expected: 1
    }
}
