class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        
        int result = 0;
        int n = s.length();

        for(int i=0;i<n;i++){
            int ch = map.get(s.charAt(i));

            if(i+1<n && ch < map.get(s.charAt(i+1))){
                result -= ch;
            }
            else{
                result += ch;
            }
        }
        return result;
    }
}