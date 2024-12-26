class Solution {
   int worker(int[] nums,int index,int sum,int target){
        if(index==nums.length) return sum==target?1:0;

       int add= worker(nums,index+1,sum+nums[index],target);
        int sub = worker(nums,index+1,sum-nums[index],target);
        return add+sub;
    }
    public int findTargetSumWays(int[] nums, int target) {
       return worker(nums,0,0,target);

    }
}