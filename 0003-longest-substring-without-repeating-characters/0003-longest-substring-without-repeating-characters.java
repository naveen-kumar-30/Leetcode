class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLen = Math.min(s.length(),1);
        int start = 0;
        int end = 0;

        Set<Character> seen = new HashSet<>();

        while(end < s.length()){
            char curr = s.charAt(end);
            while(seen.contains(curr)){
                seen.remove(s.charAt(start));
                start++;
            }
            seen.add(curr);
            int windowSize = end-start+1;
            maxLen = Math.max(windowSize,maxLen);
            end++;
        }
        return maxLen;
    }
}