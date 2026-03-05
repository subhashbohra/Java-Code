/**
 * DOUBLE MODULAR EXPONENTIATION
 * 
 * TOPICS: Math, Modular Arithmetic, Fast Exponentiation
 * 
 * PROBLEM: Calculate sum of ((base^exp) mod mod) for each variable.
 * 
 * APPROACH: Use fast exponentiation with modulo.
 * 
 * TIME: O(n * log(max_exp)), SPACE: O(1)
 */

import java.util.List;

public class DoubleModularExponentiation {
    
    public int getSum(List<List<Integer>> variables) {
        int sum = 0;
        for (List<Integer> var : variables) {
            int a = var.get(0), b = var.get(1), c = var.get(2), m = var.get(3);
            int powResult = modPow(a, b, 10);
            int finalResult = modPow(powResult, c, m);
            sum += finalResult;
        }
        return sum;
    }
    
    private int modPow(int base, int exp, int mod) {
        int result = 1;
        base %= mod;
        while (exp > 0) {
            if (exp % 2 == 1) result = (result * base) % mod;
            base = (base * base) % mod;
            exp /= 2;
        }
        return result;
    }
    
    public static void main(String[] args) {
        DoubleModularExponentiation solution = new DoubleModularExponentiation();
        System.out.println("Test: Modular exponentiation implemented");
    }
}
