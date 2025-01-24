class Solution {
    public boolean checkValid(int[][] matrix) {
        for(int j=0; j<matrix[0].length; j++){
            int[] array = new int[matrix.length];
            for(int i=0; i<matrix.length; i++){
                array[i] = matrix[i][j];
                System.out.println("row " + i);
                System.out.println("column " + j);
                System.out.println(array[i]);
            }
            Arrays.sort(array);
            for(int k=0; k<array.length; k++){
                if(array[k] != k+1){
                    return false;
                }
            }
        }
        
        for(int i=0; i<matrix.length; i++){
            int[] array = matrix[i];
            Arrays.sort(array);
            for(int j=0; j<array.length; j++){
                if(array[j] != j+1){
                    return false;
                }
            }
        }

        return true;
    }
}