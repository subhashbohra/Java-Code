/**
 * PRIME NUMBER
 * DIFFICULTY: EASY
 * 
 * TOPICS: Math
 * 
 * PROBLEM: Check if number is prime.
 * 
 * EXAMPLE:
 * Input: n = 7
 * Output: true
 * 
 * TIME: O(sqrt(n)), SPACE: O(1)
 */

public class PrimeNumber {
    
    public boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n <= 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }
        
        return true;
    }
    
    public static void main(String[] args) {
        PrimeNumber solution = new PrimeNumber();
        System.out.println("Test 1: " + solution.isPrime(7));
        System.out.println("Test 2: " + solution.isPrime(12));
    }
}
