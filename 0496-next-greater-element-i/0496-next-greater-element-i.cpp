class Solution {
public:
    vector<int> nextGreaterElement(vector<int>& nums1, vector<int>& nums2) {
        int n1=nums1.size();
        int n2= nums2.size();
        vector<int> ans(n1,-1);
        for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
                if(nums1[i]==nums2[j]){
                    for(int k=j+1;k<nums2.size();k++){
                        if(nums2[j]<nums2[k]){
                            ans[i] = nums2[k];
                            break;
                        } 
                    }
                }
            }
        }
        return ans;
    }
};