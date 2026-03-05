/**
 * EXCEL SHEET COLUMN NUMBER
 * DIFFICULTY: EASY
 * 
 * TOPICS: Math, String, Base Conversion
 * 
 * PROBLEM: Convert Excel column title to number (A=1, B=2, Z=26, AA=27).
 * 
 * EXAMPLE:
 * Input: columnTitle = "AB"
 * Output: 28
 * Explanation: A=1, B=2, so AB = 1*26 + 2 = 28
 * 
 * APPROACH: Treat as base-26 number system.
 * 
 * TIME: O(n), SPACE: O(1)
 */

public class ExcelSheetColumn {
    
    public int titleToNumber(String columnTitle) {
        int result = 0;
        
        for (char c : columnTitle.toCharArray()) {
            result = result * 26 + (c - 'A' + 1);
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        ExcelSheetColumn solution = new ExcelSheetColumn();
        System.out.println("Test 1: " + solution.titleToNumber("A")); // Expected: 1
        System.out.println("Test 2: " + solution.titleToNumber("AB")); // Expected: 28
        System.out.println("Test 3: " + solution.titleToNumber("ZY")); // Expected: 701
    }
}
