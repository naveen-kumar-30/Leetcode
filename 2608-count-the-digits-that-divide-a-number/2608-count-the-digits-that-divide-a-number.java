class Solution {
    public int countDigits(int num) {
        int res =0 ;
        int s = num;
        int count=0;
        while(num>0){
            int rem =num%10;
            if(s%rem==0)
                count++;
            num=num/10;
        }
        return count;
    }
}