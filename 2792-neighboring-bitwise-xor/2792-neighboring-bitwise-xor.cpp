class Solution {
public:
    bool doesValidArrayExist(vector<int>& derived) {
        int ans=0;
        for(int d: derived){
            ans^=d;
        }
        return ans==0;
    }
};