class Solution {
    public int averageValue(int[] nums) {
        int count=0,count1=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%6==0){
                count+=nums[i];
                count1++;
            }
        }
       if(count1==0) return 0;
       else
        return count/count1;
    }
}