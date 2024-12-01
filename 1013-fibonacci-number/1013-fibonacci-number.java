class Solution {
    public int fib(int n) {
    if(n==1) return 1;
    
        int prevnum = 0;
        int currnum = 1;
        int updatenum = 0;
        for(int i=0;i<n-1;i++){
            updatenum = currnum+prevnum;
            prevnum = currnum;
            currnum = updatenum;
        }
        return updatenum;
    }
}