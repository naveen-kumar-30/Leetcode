class Solution {
    public int removeDuplicates(int[] nums) {
        LinkedHashSet<Integer> e = new LinkedHashSet<>();
        
        for(int i : nums){
            e.add(i);
        }
        int count=0;
        int x= e.size();
        for(int i:e){
            nums[count++]=i;
        }

        return x;
    }
}