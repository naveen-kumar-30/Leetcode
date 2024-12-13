class Solution {
public:
    long long findScore(vector<int>& nums) {
        vector<pair<int,int>> sorted;
        int n = nums.size();
        for(int i=0;i<n;i++){
            sorted.push_back({nums[i],i});
        }
        sort(sorted.begin(),sorted.end());
        vector<bool> marked(n,false);
        long long ans = 0;
        for(int i=0;i<n;i++){
            int number = sorted[i].first, index = sorted[i].second;
            if(!marked[index]){
                ans +=number;
                marked[index] = true;
                if(index-1>=0){
                    marked[index-1]= true;
                }
                if(index+1<n){
                    marked[index+1] = true;
                }
            }
            
        }
        return ans;
    }
};