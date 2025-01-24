class Solution {
public:
    int majorityElement(vector<int>& nums) {
     int candidate =0;
     int count=0;

     for(int i:nums){
        if(count==0)
        {
            candidate = i;
            count=1;
        }
        else if(i==candidate)
            count++;
        else
            count--;
     }
    return candidate;
    }
};