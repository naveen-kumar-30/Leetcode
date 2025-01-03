class Solution {
public:
    int waysToSplitArray(vector<int>& nums) {
        int size=nums.size();
        vector<long long> psums(size);
        psums[0] = nums[0];
        for(int i=1;i<size;i++){    
            psums[i] = psums[i-1] + nums[i] ; 
        }
        int count=0;
        for(int i=0;i<size-1;i++){
           long long left = psums[i];   
           long long right = psums[size-1]- psums[i];
           if(left>=right) count++;
        }
        return count;
    }
};