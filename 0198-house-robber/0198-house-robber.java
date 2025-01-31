class Solution {
    public int rob(int[] nums) {
        int sum=0;
        if(nums.length==0) return 0;
        if(nums.length==1) return nums[0];
       int prev2 = 0;
        int prev1=0;
        for(int i=0;i<nums.length;i++){
            int curr = Math.max(prev1,prev2+nums[i]);
            prev2 = prev1;
            prev1 = curr;
        }
        return prev1;
    }
}