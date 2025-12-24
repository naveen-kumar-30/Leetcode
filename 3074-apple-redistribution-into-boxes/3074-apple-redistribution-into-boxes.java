class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        
        int a = 0;

        for(int x : apple){
            a += x;
        }

        Arrays.sort(capacity);
        int box = 0;
        int curr = 0;
        for(int i= capacity.length-1;i>=0 ;i--){
            curr += capacity[i];
            box++;

            if(curr >= a){
                return box;
            }
        }

        return box;
    }
}