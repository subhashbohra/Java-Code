/**
 * DIVIDE TWO INTEGERS
 * DIFFICULTY: MEDIUM
 * 
 * TOPICS: Math, Bit Manipulation, Binary Search
 * 
 * PROBLEM: Divide two integers without using multiplication, division, or mod operator.
 * 
 * EXAMPLE:
 * Input: dividend = 10, divisor = 3
 * Output: 3
 * 
 * APPROACH: Use bit shifting to subtract divisor multiple times.
 * 
 * TIME: O(log n), SPACE: O(1)
 */

public class DivideTwoIntegers {
    
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;
        
        long dvd = Math.abs((long) dividend);
        long dvs = Math.abs((long) divisor);
        int sign = (dividend > 0) ^ (divisor > 0) ? -1 : 1;
        
        long result = 0;
        while (dvd >= dvs) {
            long temp = dvs, multiple = 1;
            while (dvd >= (temp << 1)) {
                temp <<= 1;
                multiple <<= 1;
            }
            dvd -= temp;
            result += multiple;
        }
        
        return (int) (sign * result);
    }
    
    public static void main(String[] args) {
        DivideTwoIntegers solution = new DivideTwoIntegers();
        System.out.println("Test 1: " + solution.divide(10, 3)); // Expected: 3
        System.out.println("Test 2: " + solution.divide(7, -3)); // Expected: -2
    }
}
