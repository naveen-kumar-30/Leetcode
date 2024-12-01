class Solution {
    public boolean isPalindrome(int x) {
        int rem=0;
        int res=0;
        int n = x;
        while(x>0){
            rem = x%10;
            res = res*10+rem;
            x=x/10;
        }
        if(n==res)
            return true;
        return false;
    }
}