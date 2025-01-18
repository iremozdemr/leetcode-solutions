class Solution {
    public int countNegatives(int[][] grid) {
        int count = 0;

        for(int i=0; i<grid.length; i++){
            for(int j=grid[i].length-1; j>=0; j--){
                if(grid[i][j] < 0){
                    count++;
                }
                if(grid[i][j] >= 0){
                    break;
                    /*
                    if(i<grid.length-1){
                        i++;
                        j=grid[i].length-1;
                    }
                    */
                }
            }
        }

        return count;
    }
}