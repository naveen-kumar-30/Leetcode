class Solution {
public:
    string shiftingLetters(string s, vector<vector<int>>& shifts) {
       int n = s.size();
       vector<int> diffArray(n+1,0);
       for(auto shift:shifts){
        int left = shift[0] , right=shift[1],d=shift[2];
        if(d==1){
            diffArray[right+1] += 1;
            diffArray[left] += -1; 
        }
        else
        {
            diffArray[right+1] += -1;
            diffArray[left] += 1;
        }
       }

       string res(n,' ');
       int diff=0;
       for(int i=n;i>0;i--){
        diff+=diffArray[i];
        int netshift =  (diff %26 +26)%26;
        res[i-1] = 'a' +(s[i-1]-'a' + netshift)%26;
    
       }
       return res; 
    }
};