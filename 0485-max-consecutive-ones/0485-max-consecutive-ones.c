int findMaxConsecutiveOnes(int* nums, int numsSize) {
    int count=0;
    int ans;
    for(int i=0;i<numsSize;i++)
    {
            if(nums[i]==0)
                count=0;
            else
                count++;
                ans=fmax(ans,count);
                
    }
    return ans;
}