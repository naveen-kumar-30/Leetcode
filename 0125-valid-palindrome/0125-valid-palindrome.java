class Solution {
    public boolean isPalindrome(String s) {
        int indexs = 0;
        int indext = s.length()-1;

        s = s.toLowerCase();
        while(indexs < indext){
   
             if(!((s.charAt(indexs)>='a' &&s.charAt(indexs)<='z') || (s.charAt(indexs)>='0' &&s.charAt(indexs)<='9' ) ) ){
                indexs++;
                continue;
            }
             if(!((s.charAt(indext)>='a' &&s.charAt(indext)<='z') ||(s.charAt(indext)>='0' &&s.charAt(indext)<='9' ) ) ){
                indext--;
                continue;
            }
            if(s.charAt(indexs)!=s.charAt(indext)){
                return false;
            }

           indexs++;
           indext--;
            
        }
        return true;
    }
}