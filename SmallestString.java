/**
 * LEXICOGRAPHICALLY SMALLEST GENERATED STRING
 * 
 * TOPICS: String, Greedy
 * 
 * PROBLEM: Generate lexicographically smallest string.
 * 
 * APPROACH: Build string character by character greedily.
 * 
 * TIME: O(n), SPACE: O(n)
 */

public class SmallestString {
    
    public String getSmallestString(int n, int k) {
        char[] result = new char[n];
        for (int i = 0; i < n; i++) result[i] = 'a';
        k -= n;
        
        for (int i = n - 1; i >= 0 && k > 0; i--) {
            int add = Math.min(k, 25);
            result[i] = (char)('a' + add);
            k -= add;
        }
        
        return new String(result);
    }
    
    public static void main(String[] args) {
        SmallestString solution = new SmallestString();
        System.out.println("Test: " + solution.getSmallestString(3, 27));
    }
}
