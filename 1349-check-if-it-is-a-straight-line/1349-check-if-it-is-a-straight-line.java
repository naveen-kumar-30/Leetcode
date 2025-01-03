class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        int n = coordinates.length;
        int diffx = coordinates[1][0] - coordinates[0][0];
        int diffy = coordinates[1][1] - coordinates[0][1];
        int curr_diffx,curr_diffy;
        for(int i=2;i<n;++i){
            curr_diffx = coordinates[i][0] - coordinates[i-1][0];
            curr_diffy = coordinates[i][1] - coordinates[i-1][1];
            if((diffy * curr_diffx) != (curr_diffy *diffx))
                    return false;
            
        }
        return true;
    }
}