class Solution {
    public int deleteGreatestValue(int[][] grid) {
        int sum = 0;

        for(int k=0; k<grid[0].length; k++){
            ArrayList<Integer> list = new ArrayList<>();

            for(int i=0; i<grid.length; i++){
                int max = 0;
                int x = 0;
                int y = 0;
                for(int j=0; j<grid[0].length; j++){
                    if(grid[i][j] > max){
                        max = grid[i][j];
                        x = i;
                        y = j;
                    }
                }
                grid[x][y] = 0;
                list.add(max);
            }
            
            list.sort(null);
            sum += list.get(list.size()-1);
        }

        return sum;
    }
}