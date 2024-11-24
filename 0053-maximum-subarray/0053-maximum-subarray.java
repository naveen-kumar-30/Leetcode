class Solution {
    public int maxSubArray(int[] nums) {
        int max1= Integer.MIN_VALUE;
      //  System.out.println((nums.length));
         int sum=0;
        for(int i=0;i<nums.length;i++){
           
                sum+=nums[i];
                max1= Math.max(sum,max1);
                if(sum<0)
                    sum=0;
            }
        
        return max1;
    }
}