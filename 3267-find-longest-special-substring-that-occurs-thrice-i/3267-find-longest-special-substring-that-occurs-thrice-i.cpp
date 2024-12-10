class Solution {
public:
    int maximumLength(string s) {
        map<pair<char,int>,int> map;
        for(int i=0;i<s.length();i++){
                  int curr = s[i]; 
                  int len = 0;
            for(int j=i;j<s.length();j++){
                if(curr == s[j]){
                    len++;       
                    map[{curr,len}]++;
                }
                else
                    break;
            }
        }
            int ans=0;
            for(auto i:map){
                int len = i.first.second;
                if(i.second>=3 && len>ans){
                    ans =len;
                }
            }
            return ans==0?-1:ans;
        }
};