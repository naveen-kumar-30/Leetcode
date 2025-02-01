class Solution {
    public int coinChange(int[] coins, int amount) {
     if(amount==0) return 0;

     Queue<Integer> q = new LinkedList<>();
     Set<Integer> visited = new HashSet<>();

    int steps=0;

     q.add(amount);
     visited.add(amount);

     while(!q.isEmpty()){
        int size = q.size();
        steps++;
        for(int i=0;i<size;i++){
            int curramount = q.poll();
        for(int coin :coins){
            int newAmount = curramount-coin;

            if(newAmount==0) return steps;

            if(newAmount>0 && !visited.contains(newAmount)){
                q.add(newAmount);
                visited.add(newAmount);
            }
        }
        }
     }
     return -1;
    }
}