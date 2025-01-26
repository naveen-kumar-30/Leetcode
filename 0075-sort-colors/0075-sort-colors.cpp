class Solution {
public:
    void sortColors(vector<int>& nums) {
         for(int i=0;i<nums.size()-1;i++){
            int min = i;
            for(int j=i;j<nums.size();j++){
                if(nums[min]>nums[j])
                        min = j;
            }
            int temp  =nums[min];
            nums[min] = nums[i];
            nums[i] = temp;
        }
    }
};