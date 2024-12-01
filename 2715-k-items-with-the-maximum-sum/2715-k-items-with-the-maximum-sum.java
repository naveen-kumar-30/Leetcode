class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        int n = numOnes+numZeros+numNegOnes;
        int []arr = new int [n];
        int i=0;
            while(numOnes>0){
                arr[i++] = 1;
                numOnes--;
            }
            while(numZeros>0){
                arr[i++] = 0;
                numZeros--;
            }
            while(numNegOnes>0){
                arr[i++] = -1;
                numNegOnes--;
            }
            int sum=0;
            for(int j=0;j<n;j++){
                if(k>0){
                    sum+=arr[j];
                    k--;
                }
            }
            
         return sum;

    }
}