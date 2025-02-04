class Solution {
    public int maxAscendingSum(int[] nums) {
        int sum = nums[0];
        int maxi=0; 
        for(int i=1;i<nums.length;i++){
            if(nums[i]<=nums[i-1]){
                maxi= Math.max(maxi,sum);
                sum=0;
            }
            sum+=nums[i];
        }
        return Math.max(sum,maxi);
    }
}