bool isAnagram(char* s, char* t) {
   int count[26];
   for(int i=0;s[i]!=0;i++){
        count[s[i]-'a']++;
   }
   for(int i=0;t[i]!=0;i++){
    count[t[i]-'a']--;
   }
   for(int i=0;i<26;i++){
        if(count[i]!=0)
            return false;
   }
   return true;
}