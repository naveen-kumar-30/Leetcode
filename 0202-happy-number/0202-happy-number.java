class Solution {
    public boolean isHappy(int n) {
       if(n==1||n==7) return true;
    
        while(n>=10){
            int res=0;
            while(n>=1){
          int rem=n%10;
            res+=(rem*rem);
            n=n/10;
        }
        if(res==1 ||res==7){
            return true;
        }
        n=res;
        }
        return n==1;
        
    }
   
    
}