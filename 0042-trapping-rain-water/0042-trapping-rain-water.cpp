class Solution {
public:
    int trap(vector<int>& height) {
     int n=height.size();
     int left=0;
     int right=n-1;
     int left_max= height[left];
     int right_max= height[right];
    int res=0;
     while(left<right){
        if(height[left]<height[right]){
            right_max = height[right];
            if(height[left]<left_max){
                res += left_max-height[left];
            }
            else
            {
                left_max = height[left];
            }
            left++;
        }
        else
        {
            left_max = height[left];
            if(height[right]<right_max){
                res += right_max-height[right];
            }
            else{
                right_max = height[right];
            }
            right--;
        }
        
     }
     return res;
        
    }
};