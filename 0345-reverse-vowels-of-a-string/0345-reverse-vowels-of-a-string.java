class Solution {
    public String reverseVowels(String s) {
        
        Set<Character> ans = new HashSet<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
        char [] res = s.toCharArray();
        int left = 0;
        int right = s.length()-1;

        while(left < right){
            while(left < right && !ans.contains(res[left])){
                    left++;
            }

            while(left < right && !ans.contains(res[right])){
                right--;
            }

            char temp = res[left];
            res[left] = res[right];
            res[right] = temp;
            left++;
            right--;
        }
        return new String(res);

       
    }
}