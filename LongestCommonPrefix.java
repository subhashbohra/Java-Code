/**
 * LONGEST COMMON PREFIX
 * DIFFICULTY: EASY
 * 
 * TOPICS: String, Array
 * 
 * PROBLEM: Find longest common prefix among strings.
 * 
 * EXAMPLE:
 * Input: strs = ["flower","flow","flight"]
 * Output: "fl"
 * 
 * TIME: O(S), SPACE: O(1)
 */

public class LongestCommonPrefix {
    
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        
        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (i >= strs[j].length() || strs[j].charAt(i) != c) {
                    return strs[0].substring(0, i);
                }
            }
        }
        
        return strs[0];
    }
    
    public static void main(String[] args) {
        LongestCommonPrefix solution = new LongestCommonPrefix();
        String[] strs1 = {"flower", "flow", "flight"};
        System.out.println("Test 1: " + solution.longestCommonPrefix(strs1));
        
        String[] strs2 = {"dog", "racecar", "car"};
        System.out.println("Test 2: " + solution.longestCommonPrefix(strs2));
    }
}
