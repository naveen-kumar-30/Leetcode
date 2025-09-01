class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder ans = new StringBuilder();
        
        int left = 0;
        int right=0;

        while(left < word1.length() && right<word2.length()){
            ans.append(word1.charAt(left));
            ans.append(word2.charAt(right));
            left++;
            right++;
        }

        if(left < word1.length()){
            while(left<word1.length()){
                ans.append(word1.charAt(left));
                left++;
            }
        }

        if(right < word2.length()){
            while(right<word2.length()){
                ans.append(word2.charAt(right));
                right++;
            }
        }

        return ans.toString();


    }
}