class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int row = obstacleGrid.length;
        int column = obstacleGrid[0].length;

        int[][] array = new int[row][column];
        if(obstacleGrid[0][0] != 1){
            array[0][0] = 1;
        }

        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                if(j+1<column){
                    if(obstacleGrid[i][j+1] != 1){
                        array[i][j+1] += array[i][j];
                    }
                }
                if(i+1<row){
                    if(obstacleGrid[i+1][j] != 1){
                        array[i+1][j] += array[i][j];
                    }
                }
            }
        }

        return array[row-1][column-1];
    }
}