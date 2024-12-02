class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int res=0;
        int s = x;
        while(x>0){
           int rem=x%10;
            res+=rem;
            x=x/10;
        }
        if(s%res==0)
            return res;
        return -1;
    }
}