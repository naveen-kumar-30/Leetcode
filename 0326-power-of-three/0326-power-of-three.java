class Solution {
    public boolean isPowerOfThree(int n) {
       if(n==1) return true;
        if(n<=0) return false;
        while(n!=1){
            if(n%3!=0)
                return false;
            else
            n=n/3;
        }
        return true;
    }
}