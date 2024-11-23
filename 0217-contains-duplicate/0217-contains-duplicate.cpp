class Solution {
public:
    bool containsDuplicate(vector<int>& nums) {
        unordered_map<int,int> emap ;
        for(int i=0;i<nums.size();i++){
            emap[nums[i]]++;
        }
        for(int i=0;i<nums.size();i++){
            if(emap[nums[i]]>=2)
                return true;
        }
        return false;
    }
};