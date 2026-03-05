/**
 * LONGEST SUBSTRING WITHOUT REPEATING CHARACTERS
 * DIFFICULTY: MEDIUM
 * 
 * TOPICS: String, Sliding Window
 * 
 * PROBLEM: Find length of longest substring without repeating characters.
 * 
 * EXAMPLE:
 * Input: s = "abcabcbb"
 * Output: 3
 * 
 * TIME: O(n), SPACE: O(min(n,m))
 */

import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {
    
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int left = 0, maxLen = 0;
        
        for (int right = 0; right < s.length(); right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            maxLen = Math.max(maxLen, right - left + 1);
        }
        
        return maxLen;
    }
    
    public static void main(String[] args) {
        LongestSubstring solution = new LongestSubstring();
        System.out.println("Test 1: " + solution.lengthOfLongestSubstring("abcabcbb"));
        System.out.println("Test 2: " + solution.lengthOfLongestSubstring("bbbbb"));
    }
}
