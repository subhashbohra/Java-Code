/**
 * VALID PARENTHESES
 * DIFFICULTY: EASY
 * 
 * TOPICS: String, Stack
 * 
 * PROBLEM: Check if parentheses are valid.
 * 
 * EXAMPLE:
 * Input: s = "()[]{}"
 * Output: true
 * 
 * TIME: O(n), SPACE: O(n)
 */

import java.util.Stack;

public class ValidParentheses {
    
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false;
                char top = stack.pop();
                if (c == ')' && top != '(') return false;
                if (c == '}' && top != '{') return false;
                if (c == ']' && top != '[') return false;
            }
        }
        
        return stack.isEmpty();
    }
    
    public static void main(String[] args) {
        ValidParentheses solution = new ValidParentheses();
        System.out.println("Test 1: " + solution.isValid("()"));
        System.out.println("Test 2: " + solution.isValid("()[]{}"));
        System.out.println("Test 3: " + solution.isValid("(]"));
    }
}
