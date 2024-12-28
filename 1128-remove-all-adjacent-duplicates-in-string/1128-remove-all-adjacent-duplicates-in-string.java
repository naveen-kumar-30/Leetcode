class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();

        for(char i:s.toCharArray()){
            if(stack.isEmpty() || i != stack.peek()){
               stack.push(i);
            }
            else
                stack.pop();
        }
        StringBuilder ans = new StringBuilder("");
        for(Character i : stack){
            ans.append(i);
        }
        return ans.toString();
    }
}