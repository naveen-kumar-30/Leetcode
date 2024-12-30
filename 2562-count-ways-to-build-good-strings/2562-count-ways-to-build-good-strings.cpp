class Solution {
public:
    int helper(int len,int low,int high,int zero,int one,vector<int>&dp){
        if(len>high) return 0;
        if(dp[len]!=-1) return dp[len];        
        int res=0;
        if(len>=low) res+=1;
        res+= helper(len+zero,low,high,zero,one,dp);
        res+=helper(len+one,low,high,zero,one,dp);

        return dp[len] = res%1000000007;
    }
    
    int countGoodStrings(int low, int high, int zero, int one) {
      vector<int> dp(high+1,-1);
      return helper(0,low,high,zero,one,dp);  
    }
};