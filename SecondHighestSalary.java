/**
 * SECOND HIGHEST SALARY
 * 
 * TOPICS: SQL, Database Query
 * 
 * PROBLEM: Find second highest salary from Employee table.
 * 
 * SQL SOLUTION:
 * SELECT MAX(salary) AS SecondHighestSalary
 * FROM Employee
 * WHERE salary < (SELECT MAX(salary) FROM Employee);
 * 
 * ALTERNATIVE:
 * SELECT DISTINCT salary AS SecondHighestSalary
 * FROM Employee
 * ORDER BY salary DESC
 * LIMIT 1 OFFSET 1;
 * 
 * TIME: O(n log n), SPACE: O(1)
 */

import java.util.Arrays;

public class SecondHighestSalary {
    
    public Integer findSecondHighest(int[] salaries) {
        if (salaries == null || salaries.length < 2) return null;
        
        Arrays.sort(salaries);
        
        for (int i = salaries.length - 2; i >= 0; i--) {
            if (salaries[i] != salaries[salaries.length - 1]) {
                return salaries[i];
            }
        }
        
        return null;
    }
    
    public static void main(String[] args) {
        SecondHighestSalary solution = new SecondHighestSalary();
        int[] salaries = {100, 200, 300};
        System.out.println("Test: " + solution.findSecondHighest(salaries));
    }
}
