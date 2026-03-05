/**
 * MINIMUM NUMBER OF DAYS TO MAKE M BOUQUETS
 * 
 * TOPICS: Binary Search, Array
 * 
 * PROBLEM: Find minimum days to make m bouquets with k adjacent flowers.
 * 
 * EXAMPLE:
 * Input: bloomDay = [1,10,3,10,2], m = 3, k = 1
 * Output: 3
 * 
 * APPROACH: Binary search on days. Check if possible to make m bouquets.
 * 
 * TIME: O(n log(max)), SPACE: O(1)
 */

public class MinimumBouquets {
    
    public int minDays(int[] bloomDay, int m, int k) {
        if (m * k > bloomDay.length) return -1;
        
        int left = 1, right = 0;
        for (int day : bloomDay) right = Math.max(right, day);
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (canMake(bloomDay, m, k, mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        
        return left;
    }
    
    private boolean canMake(int[] bloomDay, int m, int k, int day) {
        int bouquets = 0, flowers = 0;
        for (int bloom : bloomDay) {
            if (bloom <= day) {
                flowers++;
                if (flowers == k) {
                    bouquets++;
                    flowers = 0;
                }
            } else {
                flowers = 0;
            }
        }
        return bouquets >= m;
    }
    
    public static void main(String[] args) {
        MinimumBouquets solution = new MinimumBouquets();
        int[] bloomDay = {1,10,3,10,2};
        System.out.println("Test: " + solution.minDays(bloomDay, 3, 1));
    }
}
