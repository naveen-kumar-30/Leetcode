class Solution {
public:
    int maxChunksToSorted(vector<int>& arr) {
        vector<int>maxi = arr;
        vector<int>mini = arr;
        for(int i=1;i<arr.size();i++){
            maxi[i] = max(maxi[i-1],maxi[i]);
        }        
        for(int i=arr.size()-2;i>=0;i--){
            mini[i] = min(mini[i+1],mini[i]);
        }
        int chunk =1;
        for(int i=0;i<arr.size()-1;i++){
            if(maxi[i]<mini[i+1])
                chunk++;
        }
        return chunk;
    }
};