import java.util.*;

class Solution {
    public int maxTwoEvents(int[][] events) {
        Arrays.sort(events, (a, b) -> Integer.compare(a[0], b[0]));
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Integer.compare(a[0], b[0]));
        int maxVal = 0, ans = 0;
        
        for (int[] event : events) {
            int start = event[0], end = event[1], value = event[2];
            
            // Remove all events that end before the current event's start time
            while (!pq.isEmpty() && pq.peek()[0] < start) {
                maxVal = Math.max(maxVal, pq.poll()[1]);
            }
            
            // Update the maximum sum of values
            ans = Math.max(ans, maxVal + value);
            
            // Add the current event to the priority queue
            pq.offer(new int[] {end, value});
        }
        
        return ans;
    }
}