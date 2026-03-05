/**
 * FURTHEST POINT FROM ORIGIN
 * 
 * TOPICS: String, Greedy
 * 
 * PROBLEM: Find furthest distance from origin given moves L, R, _.
 * 
 * EXAMPLE:
 * Input: moves = "L_RL__R"
 * Output: 3
 * 
 * APPROACH: Count L and R. Use _ to maximize distance.
 * 
 * TIME: O(n), SPACE: O(1)
 */

public class FurthestPoint {
    
    public int furthestDistanceFromOrigin(String moves) {
        int left = 0, right = 0, blank = 0;
        
        for (char c : moves.toCharArray()) {
            if (c == 'L') left++;
            else if (c == 'R') right++;
            else blank++;
        }
        
        return Math.abs(left - right) + blank;
    }
    
    public static void main(String[] args) {
        FurthestPoint solution = new FurthestPoint();
        System.out.println("Test: " + solution.furthestDistanceFromOrigin("L_RL__R"));
    }
}
