class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
            int res=0;
        for(int i=1;i<=mainTank;i++){
            if(additionalTank!=0 && i%5==0){
                additionalTank-=1;
                res+=10;
                mainTank+=1;
            }
            else
                res+=10;
        }
        return res;

    }
}