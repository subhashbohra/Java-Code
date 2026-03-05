/**
 * COUNT SUBMATRICES WITH TOP-LEFT ELEMENT AND SUM LESS THAN K
 * 
 * TOPICS: Matrix, Prefix Sum, 2D Array
 * 
 * PROBLEM: Count submatrices with top-left at (0,0) and sum < k.
 * 
 * APPROACH: Use prefix sum. Check each position.
 * 
 * TIME: O(m*n), SPACE: O(m*n)
 */

public class CountSubmatrices {
    
    public int countSubmatrices(int[][] grid, int k) {
        int m = grid.length, n = grid[0].length;
        int[][] prefix = new int[m + 1][n + 1];
        int count = 0;
        
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                prefix[i][j] = grid[i-1][j-1] + prefix[i-1][j] + prefix[i][j-1] - prefix[i-1][j-1];
                if (prefix[i][j] <= k) count++;
            }
        }
        
        return count;
    }
    
    public static void main(String[] args) {
        CountSubmatrices solution = new CountSubmatrices();
        int[][] grid = {{1,1,1},{1,1,1}};
        System.out.println("Test: " + solution.countSubmatrices(grid, 4));
    }
}
