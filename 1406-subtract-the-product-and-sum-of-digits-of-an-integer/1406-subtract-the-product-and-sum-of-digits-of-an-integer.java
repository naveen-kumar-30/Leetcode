class Solution {
    public int subtractProductAndSum(int n) {
        int rem=0,sum=0,prd=1;
        while(n>0){
            rem= n%10;
            sum+=rem;
            prd*=rem;
            n=n/10;
        }
        return (prd-sum);
    }
}