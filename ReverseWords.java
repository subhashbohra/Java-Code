/**
 * REVERSE WORDS IN A STRING
 * 
 * TOPICS: String manipulation, Two-pointer, StringBuilder
 * 
 * PROBLEM: Reverse the order of words in a string.
 * 
 * EXAMPLE:
 * Input: "the sky is blue"
 * Output: "blue is sky the"
 * 
 * APPROACH: Split by spaces, reverse order, join.
 * 
 * TIME: O(n), SPACE: O(n)
 */

public class ReverseWords {
    
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            if (i > 0) sb.append(" ");
        }
        
        return sb.toString();
    }
    
    public static void main(String[] args) {
        ReverseWords solution = new ReverseWords();
        System.out.println("Test: " + solution.reverseWords("the sky is blue"));
    }
}
