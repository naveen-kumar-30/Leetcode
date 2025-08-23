class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        for(int row=0;row<numRows;row++){
            List<Integer> newRow = new ArrayList<>();
            for(int col=0 ;col<=row;col++)
            {
                if(col ==0 || col==row){
                    newRow.add(1);
                }
                else{
                    int val = triangle.get(row-1).get(col-1) +
                            triangle.get(row-1).get(col);
                        newRow.add(val);
                }
            }
            triangle.add(newRow);
        }
        return triangle;
    }
}