class Solution {
    public int calPoints(String[] operations) {
         Stack<Integer> ans = new Stack<>();
        
        for(String ops: operations){
            if(ops.equals("+")){
              int top = ans.pop();
              int newtop = top+ ans.peek();
              ans.push(top);
              ans.push(newtop);  
            }
           else if(ops.equals("C")){
                ans.pop();
           }
            else if(ops.equals("D")){
                ans.push(2*ans.peek());
            }
            else{
                ans.push(Integer.valueOf(ops));
            }
        }
        int sum=0;
        for(int s : ans ){
            sum+=s;
        }
        return sum;
    }
}