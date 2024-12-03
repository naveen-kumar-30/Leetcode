class Solution {
    public int countOdds(int low, int high) {
        int count=0;
        if(low%2==0){
            for(int i=low+1;i<high+1;i+=2){
                count++;
            }
        }
        else
        {
            for(int i=low;i<high+1;i+=2){
                count++;
            }
        }
        return count;
    }
}