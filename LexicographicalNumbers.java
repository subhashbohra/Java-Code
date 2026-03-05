/**
 * LEXICOGRAPHICAL NUMBERS
 * 
 * TOPICS: DFS, Recursion, Number generation
 * 
 * PROBLEM: Return numbers from 1 to n in lexicographical order.
 * 
 * EXAMPLE:
 * Input: n = 13
 * Output: [1,10,11,12,13,2,3,4,5,6,7,8,9]
 * 
 * APPROACH: DFS starting from 1-9, append digits 0-9.
 * 
 * TIME: O(n), SPACE: O(log n) for recursion
 */

import java.util.ArrayList;
import java.util.List;

public class LexicographicalNumbers {
    
    public List<Integer> lexicalOrder(int n) {
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= 9; i++) {
            dfs(i, n, result);
        }
        return result;
    }
    
    private void dfs(int current, int n, List<Integer> result) {
        if (current > n) return;
        result.add(current);
        for (int i = 0; i <= 9; i++) {
            if (current * 10 + i > n) return;
            dfs(current * 10 + i, n, result);
        }
    }
    
    public static void main(String[] args) {
        LexicographicalNumbers solution = new LexicographicalNumbers();
        System.out.println("Test: " + solution.lexicalOrder(13));
    }
}
