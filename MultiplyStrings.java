/**
 * MULTIPLY STRINGS
 * DIFFICULTY: MEDIUM
 * 
 * TOPICS: Math, String, Array
 * 
 * PROBLEM: Multiply two non-negative integers represented as strings.
 * 
 * EXAMPLE:
 * Input: num1 = "123", num2 = "456"
 * Output: "56088"
 * 
 * APPROACH: Simulate multiplication digit by digit, store in array.
 * 
 * TIME: O(m*n), SPACE: O(m+n)
 */

public class MultiplyStrings {
    
    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) return "0";
        
        int m = num1.length(), n = num2.length();
        int[] result = new int[m + n];
        
        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                int p1 = i + j, p2 = i + j + 1;
                int sum = mul + result[p2];
                
                result[p2] = sum % 10;
                result[p1] += sum / 10;
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for (int num : result) {
            if (!(sb.length() == 0 && num == 0)) sb.append(num);
        }
        
        return sb.toString();
    }
    
    public static void main(String[] args) {
        MultiplyStrings solution = new MultiplyStrings();
        System.out.println("Test 1: " + solution.multiply("123", "456")); // Expected: "56088"
        System.out.println("Test 2: " + solution.multiply("2", "3")); // Expected: "6"
    }
}
