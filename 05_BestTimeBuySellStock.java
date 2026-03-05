/**
 * BEST TIME TO BUY AND SELL STOCK
 * DIFFICULTY: EASY
 * 
 * TOPICS: Array, Greedy
 * 
 * PROBLEM: Find max profit from buying and selling stock once.
 * 
 * EXAMPLE:
 * Input: prices = [7,1,5,3,6,4]
 * Output: 5
 * 
 * TIME: O(n), SPACE: O(1)
 */

public class BestTimeBuySellStock {
    
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        
        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else {
                maxProfit = Math.max(maxProfit, price - minPrice);
            }
        }
        
        return maxProfit;
    }
    
    public static void main(String[] args) {
        BestTimeBuySellStock solution = new BestTimeBuySellStock();
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println("Test: " + solution.maxProfit(prices));
    }
}
