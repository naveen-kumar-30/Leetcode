class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        helping(result,"",0,0,n);
        return result;
    }

    public  void helping(List<String> result,String current,int opencount,int closecount,int n){

        if(opencount==n && closecount==n){
            result.add(current);
            return;
        }
        
        if(opencount<n)
            helping(result,current+"(",opencount+1,closecount,n);
        if(closecount<opencount)
            helping(result,current+")",opencount,closecount+1,n);
        
    }
}