class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=0;
        for(int i:candies){
             max = Math.max(i,max);
        }
        max-=extraCandies;
    
        int count=0;
       List<Boolean>booleanList = new ArrayList<>();
        for(int i=0;i<candies.length;i++){
            if(candies[i]>=max) {
                booleanList.add(true);
              
            }
            else
                booleanList.add(false);
         
            
        
        }
       

        return booleanList;
    }
}