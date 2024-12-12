class Solution {
public:
    long long pickGifts(vector<int>& gifts, int k) {
          while(k>0){
            int maxIndex=0;
            for(int i=0;i<gifts.size();i++){
                if(gifts[maxIndex]<gifts[i]){
                    maxIndex =i;
                }
            }
                gifts[maxIndex] = floor(sqrt(gifts[maxIndex]));
            k--;
        }
        long long sum=0;
        for(int i:gifts){
            sum+=i;
        }
        return sum;
    }
};