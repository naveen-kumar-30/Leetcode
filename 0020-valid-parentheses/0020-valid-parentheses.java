class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        for(Character i : s.toCharArray()){
            if(i == '{'){
                st.push('}');
            }
            else if(i== '['){
                st.push(']');
            }
            else if(i == '('){
                st.push(')');
            }
            else if(st.isEmpty() || i != st.pop()){
                return false;
            }

        }
        return st.isEmpty();
    }
}