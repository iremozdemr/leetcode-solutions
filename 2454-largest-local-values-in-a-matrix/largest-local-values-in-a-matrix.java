class Solution {
    public int[][] largestLocal(int[][] grid) {
        int length = grid.length;
        int newLength = length-2;

        int[][] newArray = new int[newLength][newLength];

        ArrayList<Integer> list = new ArrayList<>();

        int i=0;
        int j=0;
        while(i<newLength){
            while(j<newLength){
                int startRow=i;
                int startColumn=j;
                int endRow = i+3;
                int endColumn = j+3;
                int max = 0;
                for(int k=startRow; k<endRow; k++){
                    for(int m=startColumn; m<endColumn; m++){
                        if(grid[k][m] > max){
                            max = grid[k][m];
                        }
                    }
                }
                System.out.println(max);
                list.add(max);
                j++;
            }
            j=0;
            i++;
        }

        System.out.println(list.size());

        int count = 0;
        for(int a=0; a<newLength; a++){
            for(int b=0; b<newLength; b++){
                newArray[a][b] = list.get(count);
                count++;
            }
        }

        return newArray;
    }
}