class Solution {
public:
    int minimumLength(string s) {
        vector<int> count (26,0);
        for(int ch:s){
            count[ch - 'a']++;
        }
        int co=0;
        for(int n:count){
            if(n==0)    
            continue;
            if(n%2==0)
                co+=2;
            else
                co+=1;
        }
        return co;
    }
};