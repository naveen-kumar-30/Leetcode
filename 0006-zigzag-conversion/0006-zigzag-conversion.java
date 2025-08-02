class Solution {
    public String convert(String s, int numRows) {

       if(numRows == 1 || s.length() <= numRows){
            return s;
       }

        StringBuilder [] answer = new  StringBuilder[numRows];

        for(int i=0;i<numRows;i++){
            answer[i] = new StringBuilder();
        }

        int currRow = 0;
        Boolean goingDown = false;

        for(char ch : s.toCharArray()){
            answer[currRow].append(ch);  

            if(currRow == 0 || currRow == numRows -1){
                goingDown = !goingDown;
            }

            currRow += goingDown?1:-1;
        }
        StringBuilder ans = new StringBuilder();
        for(StringBuilder sb : answer){
            ans.append(sb);
        }

        return ans.toString();
    }
}