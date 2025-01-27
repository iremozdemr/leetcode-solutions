class NeighborSum {
    int[][] grid = null;

    public NeighborSum(int[][] grid) {
        this.grid = grid;
    }
    
    public int adjacentSum(int value) {
        int sum = 0;

        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j] == value){
                    if(i-1 >= 0){
                        sum += grid[i-1][j];
                    }
                    if(i+1 < grid.length){
                        sum += grid[i+1][j];
                    }
                    if(j-1 >= 0){
                        sum += grid[i][j-1];
                    }
                    if(j+1 < grid[0].length){
                        sum += grid[i][j+1];
                    }
                }
            }
        }

        return sum;
    }
    
    public int diagonalSum(int value) {
        int sum = 0;

        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j] == value){
                    if(i-1 >= 0 && j-1 >= 0){
                        sum += grid[i-1][j-1];
                    }
                    if(i-1 >= 0 && j+1 < grid[0].length){
                        sum += grid[i-1][j+1];
                    }
                    if(i+1 < grid.length && j-1 >= 0){
                        sum += grid[i+1][j-1];
                    }
                    if(i+1 < grid.length && j+1 < grid[0].length){
                        sum += grid[i+1][j+1];
                    }
                }
            }
        }

        return sum;
    }
}

/**
 * Your NeighborSum object will be instantiated and called as such:
 * NeighborSum obj = new NeighborSum(grid);
 * int param_1 = obj.adjacentSum(value);
 * int param_2 = obj.diagonalSum(value);
 */