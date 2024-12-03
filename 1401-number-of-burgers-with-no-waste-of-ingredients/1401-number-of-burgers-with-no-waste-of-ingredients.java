class Solution {
    public List<Integer> numOfBurgers(int tomatoSlices, int cheeseSlices) {
        ArrayList<Integer>ans=new ArrayList<>();
        int small=(4*cheeseSlices-tomatoSlices)/2;
        int jumbo=cheeseSlices-small;
    if(tomatoSlices%2==0 && small>=0 && jumbo>=0){
     ans.add(jumbo);
     ans.add(small);  }
     return ans;
    }
}