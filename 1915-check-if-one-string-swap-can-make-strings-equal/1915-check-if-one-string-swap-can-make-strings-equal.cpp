class Solution {
public:
    bool areAlmostEqual(string s1, string s2) {
        if(s1==s2)
         return true;

        int n = s1.size();
        int m = s2.size();

        int pos=0;
        vector<char> mismatches;
        int mismatch = 0;
        while(pos<m){
            if(s1[pos]!=s2[pos]){
                mismatches.push_back(s1[pos]);
                mismatches.push_back(s2[pos]);
                mismatch++;
            }
            if(mismatch>2)
                return false;
            pos++;
        }
        if(mismatches.size()==4)
            return (mismatches[0]==mismatches[3] && mismatches[1]==mismatches[2]);
            return false;
        
    }
};