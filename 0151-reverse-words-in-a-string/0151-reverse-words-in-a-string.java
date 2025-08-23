class Solution {
    public String reverseWords(String s) {
        s = s.trim();

        int validCharacter = 0;
        for(int i=0;i<s.length();i++){
            validCharacter++;
            if(s.charAt(i) == ' '){
                while(i<s.length()-1 && s.charAt(i+1) == ' '){
                    i++;
                }
            }
        }
        int j = 0;
        char [] ans = new char[validCharacter];
        for(int i=0;i<s.length();i++){
            ans[j++] = s.charAt(i);
            if(s.charAt(i) == ' '){
                while(i<s.length()-1 && s.charAt(i+1)==' '){
                    i++;
                }
            }
        }

        int start = 0;
        int end = ans.length-1;

        reverseSorting(ans , start , end);
        start = 0;

        for(int i=0;i<ans.length;i++){
            if(ans[i] == ' '){
                end = i-1;
            reverseSorting(ans,start,end);
                start = i+1;
            }
        }
        reverseSorting(ans,start,ans.length-1);
        return String.valueOf(ans);
    }

    private static void reverseSorting(char [] ans , int start , int end){
        while(start < end){
            char temp = ans[start];
            ans[start] = ans[end];
            ans[end] = temp;
            start++;
            end--;
        }
    }
}