class Solution {
    public int maximumWealth(int[][] accounts) {
       System.out.println(accounts[0].length);
            int max=0;
        for(int i=0;i<accounts.length;i++){
            int sum=0;
         for(int j=0;j<accounts[i].length;j++){
               sum+=accounts[i][j];
         }
         max = Math.max(sum,max);
      
       }
       return max; 
}
}