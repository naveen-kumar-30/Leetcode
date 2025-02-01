class Solution {
    public int jump(int[] nums) {
        int minireach=0;
        int currend=0;
        int jump=0;
        for(int i=0;i<nums.length;i++){
            minireach = Math.max(minireach,i+nums[i]);

            if(currend==i)
            {
                jump++;
                currend = minireach;
            }
            if(currend>=nums.length-1)
                break;
        }
        return jump;
    }
}