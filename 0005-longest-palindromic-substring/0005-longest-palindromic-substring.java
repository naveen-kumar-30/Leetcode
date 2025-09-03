class Solution {
    public String longestPalindrome(String s) {
        String longLength = "";
        for(int i=0;i<s.length();i++){
            String odd = Palindrome(i,i,s);
            if(odd.length() > longLength.length()){
                longLength = odd;
            }
            String even = Palindrome(i,i+1,s);
            if(even.length() > longLength.length()){
                longLength = even;
            }
        }
        return longLength;
    }

    private String Palindrome(int i,int j,String s){
        while(i>=0 && j<s.length()){
            if(s.charAt(i) == s.charAt(j)){
                i--;
                j++;
            }
            else{
                break;
            }
        }
        return s.substring(i+1,j);
    }
}