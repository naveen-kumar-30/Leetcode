class Solution {
public:
    int maxArea(vector<int>& height) {
       int tot=0;
        int heights=0;
          int width1=0;
          int width2=0;
        for(int i=0;i<height.size();i++){
            int left=0;
            int right=height.size()-1;

            while(left<=i){
                if(height[i]<=height[left]){
                    heights = height[i];
                    width1 = left;
                    break;
                }
                left++;
            }
            while(right>=i){
                if(height[i]<=height[right]){
                    heights = height[i];
                    width2 = right;
                    break;
                }
                right--;
            }
            tot = max(tot,heights*(width2-width1));        
        }
        return tot;
    }
};