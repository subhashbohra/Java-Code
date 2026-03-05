/**
 * MINIMUM NUMBER OF REFUELING STOPS
 * 
 * TOPICS: Greedy, Priority Queue, Heap
 * 
 * PROBLEM: Return minimum refueling stops to reach target.
 * 
 * EXAMPLE:
 * Input: target = 100, startFuel = 10, stations = [[10,60],[20,30],[30,30],[60,40]]
 * Output: 2
 * 
 * APPROACH: Use max heap. Greedily pick largest fuel when needed.
 * 
 * TIME: O(n log n), SPACE: O(n)
 */

import java.util.PriorityQueue;

public class MinimumRefuelingStops {
    
    public int minRefuelStops(int target, int startFuel, int[][] stations) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        int position = startFuel, stops = 0, i = 0;
        
        while (position < target) {
            while (i < stations.length && stations[i][0] <= position) {
                pq.offer(stations[i][1]);
                i++;
            }
            if (pq.isEmpty()) return -1;
            position += pq.poll();
            stops++;
        }
        
        return stops;
    }
    
    public static void main(String[] args) {
        MinimumRefuelingStops solution = new MinimumRefuelingStops();
        int[][] stations = {{10,60},{20,30},{30,30},{60,40}};
        System.out.println("Test: " + solution.minRefuelStops(100, 10, stations));
    }
}
