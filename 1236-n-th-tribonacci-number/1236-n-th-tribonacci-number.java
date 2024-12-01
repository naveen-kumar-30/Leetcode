class Solution {
    public int tribonacci(int n) {
        if(n==0) return 0;
    
        if(n==1 || n==2 ) return 1;
        
        int prev = 0;
        int curr = 1;
        int update = 1;
        int sum=0;
        for(int i=3;i<=n;i++){
        //    int temp = update;
            sum = prev+curr+update;
            prev = curr;
            curr = update;
            update = sum;
        }
        return update;
    }
}