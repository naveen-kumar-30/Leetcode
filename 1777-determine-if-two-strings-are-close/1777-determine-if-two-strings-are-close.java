class Solution {
    public boolean closeStrings(String word1, String word2) {
char[]arr = word1.toCharArray();

        int []count1 = new int [26];
        int []count2 = new int [26];
        int n = word1.length();
        if(n!=word2.length())
            return false;
        for(int i=0;i<n;i++){
           char  freq1 = word1.charAt(i);
           char  freq2 = word2.charAt(i);
            count1[freq1-'a']++;
            count2[freq2-'a']++;
        }
        for(int i=0;i<26;i++){
            if((count1[i]==0 && count2[i]!=0 )|| (count1[i]!=0 && count2[i]==0)){
                return false;
            }
        }
        Arrays.sort(count1);
        Arrays.sort(count2);
        for(int i = 25;i>=0;i--){
            if(count1[i]!=count2[i])
                return false;
            if((count1[i] == count2[i]) && count1[i]==0 )
                return true;
        }
        return true;
    }
}