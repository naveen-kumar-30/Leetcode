class Solution {
    public int countKeyChanges(String s) {
      
       int count=0;
       s= s.toLowerCase();
        char temp=s.charAt(0);
    //    System.out.println(s);
        for(int i=1;i<s.length();i++){
           if(temp!=s.charAt(i)){
            System.out.println(s.charAt(i) +" " + i);
                count++;
           }
           
           temp = s.charAt(i);
        }
        return count;
    }
}