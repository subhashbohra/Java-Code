/**
 * PALINDROME NUMBER
 * DIFFICULTY: EASY
 * 
 * TOPICS: Math
 * 
 * PROBLEM: Check if integer is palindrome.
 * 
 * EXAMPLE:
 * Input: x = 121
 * Output: true
 * 
 * TIME: O(log n), SPACE: O(1)
 */

public class PalindromeNumber {
    
    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) return false;
        
        int reversed = 0;
        while (x > reversed) {
            reversed = reversed * 10 + x % 10;
            x /= 10;
        }
        
        return x == reversed || x == reversed / 10;
    }
    
    public static void main(String[] args) {
        PalindromeNumber solution = new PalindromeNumber();
        System.out.println("Test 1: " + solution.isPalindrome(121));
        System.out.println("Test 2: " + solution.isPalindrome(-121));
    }
}
