class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuffer sb = new StringBuffer();
         int spaceIndex =0;
        for(int i=0;i<s.length();i++){
            if(spaceIndex<spaces.length && spaces[spaceIndex]==i){
                sb.append(" ");
                spaceIndex++;
            }
        
                sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}