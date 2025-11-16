class Solution {
    public int numSub(String s) {
        
        long count =0;
        long ans = 0;
        long mod = 1_000_000_007;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '1'){
                count  = (count+ 1) % mod;
            }else{
                count = 0;
            }

            ans = (ans + count) % mod;
        }
        return (int) ans;
    }
}