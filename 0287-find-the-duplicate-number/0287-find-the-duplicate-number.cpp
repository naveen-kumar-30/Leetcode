class Solution {
public:
    int findDuplicate(vector<int>& nums) {
    int slow=0,fast=0;
    while(nums.size()){
        slow = nums[slow];
        fast = nums[nums[fast]];

        if(slow==fast)
            break;
    }
    int slow1=0;
    while(nums.size()){
        slow=nums[slow];
        slow1=nums[slow1];
        if(slow==slow1)
            return slow;
    }
    return -1;
    }
};