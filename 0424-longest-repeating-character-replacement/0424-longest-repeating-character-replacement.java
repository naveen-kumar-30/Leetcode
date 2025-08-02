class Solution {
    public int characterReplacement(String s, int k) {
        int [] count = new int [26];
        int maxFreq = 0;
        int maxLength = 0;
        int left = 0;

        for(int right =0;right<s.length();right++){
            char currChar = s.charAt(right);
            count[currChar-'A']++;
            maxFreq = Math.max(maxFreq,count[currChar-'A']);

            while((right-left+1)-maxFreq > k){
                char leftChar = s.charAt(left);
                count[leftChar-'A']--;
                left++;
            }

            maxLength = Math.max(maxLength,right-left+1);


        }
        return maxLength;
    }
}