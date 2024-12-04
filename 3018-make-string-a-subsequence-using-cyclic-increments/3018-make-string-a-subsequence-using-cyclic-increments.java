class Solution {
    public boolean canMakeSubsequence(String str1, String str2) {
        int str1len = str1.length();
        int str2len = str2.length();
        int str1Index = 0;
        int str2Target = 0;

        while(str1Index <str1len && str2Target <str2len){
            int str1char = str1.charAt(str1Index);
            int str2char = str2.charAt(str2Target);

            if(str1char == str2char ||
            str1char== 'z' && str2char=='a'||
            str1char +1 == str2char ){
                str1Index++;
                str2Target++;
            }
            else
                str1Index++;
        }
        return str2Target == str2len;
    }
}