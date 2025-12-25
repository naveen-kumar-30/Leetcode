class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);

        long maxs = 0;
        int turns = 0;

        for(int i=happiness.length-1;i>=0 && turns < k ; i--){
            int count = happiness[i] - turns;
            if(count <= 0){
                break;
            }

            maxs += count;
            turns++;
        }
        return maxs;
    }
}