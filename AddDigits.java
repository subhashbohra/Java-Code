/**
 * ADD DIGITS (Digital Root)
 * DIFFICULTY: EASY
 * 
 * TOPICS: Math, Number Theory
 * 
 * PROBLEM: Repeatedly add all digits until result is single digit.
 * 
 * EXAMPLE:
 * Input: num = 38
 * Output: 2
 * Explanation: 3 + 8 = 11, 1 + 1 = 2
 * 
 * APPROACH: Use digital root formula: 1 + (n-1) % 9
 * 
 * TIME: O(1), SPACE: O(1)
 */

public class AddDigits {
    
    public int addDigits(int num) {
        if (num == 0) return 0;
        return 1 + (num - 1) % 9;
    }
    
    public static void main(String[] args) {
        AddDigits solution = new AddDigits();
        System.out.println("Test 1: " + solution.addDigits(38)); // Expected: 2
        System.out.println("Test 2: " + solution.addDigits(0)); // Expected: 0
    }
}
