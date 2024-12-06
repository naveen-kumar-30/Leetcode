class Solution {
    public void reverseString(char[] s) {
       int indexs=0;
        int indext=s.length-1;
      
        while(indexs<indext){
            char temp = s[indexs];
            s[indexs]=s[indext];
            s[indext] = temp;
            indexs++;
            indext--;
        }
   
    }
}