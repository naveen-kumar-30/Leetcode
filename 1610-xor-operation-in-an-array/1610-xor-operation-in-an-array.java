class Solution {
    public int xorOperation(int n, int start) {
            int sum[] = new int[n];
            int count=0;
        for(int i=0;i<n;i++){
             sum[i] = start+2*i;
                count^=sum[i];
        }
        return count;
    }
}