/**
 * GCD AND LCM
 * DIFFICULTY: EASY
 * 
 * TOPICS: Math, Euclidean Algorithm
 * 
 * PROBLEM: Find GCD and LCM of two numbers.
 * 
 * EXAMPLE:
 * Input: a = 12, b = 18
 * GCD: 6, LCM: 36
 * 
 * TIME: O(log(min(a,b))), SPACE: O(1)
 */

public class GCDandLCM {
    
    public int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    
    public int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
    
    public static void main(String[] args) {
        GCDandLCM solution = new GCDandLCM();
        System.out.println("GCD(12, 18): " + solution.gcd(12, 18));
        System.out.println("LCM(12, 18): " + solution.lcm(12, 18));
    }
}
