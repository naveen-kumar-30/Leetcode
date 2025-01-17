class Solution {
public:
    int xorAllNums(vector<int>& nums1, vector<int>& nums2) {
        int ans1=0,ans2=0;
        if(nums1.size()%2!=0){
            for(int i=0;i<nums2.size();i++){
                ans1 ^= nums2[i];
            }
        }
        if(nums2.size()%2!=0){
            for(int i=0;i<nums1.size();i++){
                ans2 ^= nums1[i];
            }
        }
        return ans1^ans2;
    }
};