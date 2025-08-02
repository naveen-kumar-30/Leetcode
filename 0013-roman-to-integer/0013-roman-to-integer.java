class Solution {
    public int romanToInt(String s) {
        int [] value = new int [26];

        value['I' - 'A'] = 1;
        value['V' - 'A'] = 5;
        value['X' - 'A'] = 10;
        value['L' - 'A'] = 50;
        value['C' - 'A'] = 100;
        value['D' - 'A'] = 500;
        value['M' - 'A'] = 1000;

        int res=0;
        for(int i=0;i<s.length();i++){
            int curr = value[s.charAt(i)-'A'];

            if(i+1 < s.length()){
                int next = value[s.charAt(i+1) - 'A'];
                if(curr<next){
                    res -= curr;
                    continue;
                }
            }
            res+=curr;
        }

        return res; 
    }
}