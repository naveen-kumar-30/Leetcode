class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer>q = new PriorityQueue<>(Collections.reverseOrder());

        for(int stone:stones)
            q.add(stone);
    
        while(q.size()>1){
            int x = q.poll();
            int y  = q.poll();

            if(x!=y)
                q.add(x-y);
        }
        if(q.size()!=0)
            return q.poll();
        return 0;
    }
}