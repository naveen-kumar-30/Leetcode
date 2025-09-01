class Solution {
    public String mergeAlternately(String word1, String word2) {
        int l1 = word1.length();
        int l2 = word2.length();

        StringBuilder ans = new StringBuilder();

        int left = 0;
        int right = 0;

        while(left < l1 || right < l2){
            if(left<l1){
                ans.append(word1.charAt(left));
            }
            if(right < l2){
                ans.append(word2.charAt(right));
            }
            left++;
            right++;
        }

        return ans.toString(); 
    }
}