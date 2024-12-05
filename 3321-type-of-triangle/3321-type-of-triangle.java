class Solution {
    public String triangleType(int[] nums) {
       int a =nums[0];
       int b =nums[1];
       int c =nums[2];
       
       if(a==b && a==c && c==b)
            return "equilateral";
        else if(a+b<=c || c+a<=b || b+c<=a)
            return "none";
        else if(a==b || a==c || b==c)
            return "isosceles";
    
        
        return "scalene";
    }
}