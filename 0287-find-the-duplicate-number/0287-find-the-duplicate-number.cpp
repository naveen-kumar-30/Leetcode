class Solution {
public:
    int findDuplicate(vector<int>& nums) {
        int arr[100001]={0};
        for(int i=0;i<nums.size();i++){
            if(arr[nums[i]]==1) return nums[i];
            arr[nums[i]] = 1;
        }
        return 0;
    }
};