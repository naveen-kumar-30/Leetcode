class Solution {
    public int hammingDistance(int x, int y) {
        int c = x^y;
        int count=0;
        while(c>0){
            if((c&1)==1)
                count++;
            c=c>>1;
        }
        return count;
    }
}