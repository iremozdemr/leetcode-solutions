class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int[] soldiers = new int[mat.length];

        for(int i=0; i<mat.length; i++){
            int number = 0;
            for(int j=0; j<mat[0].length; j++){
                if(mat[i][j] == 1){
                    number++;
                }
            }
            soldiers[i] = number;
        }

        int[] result = new int[k];
        int index = 0;

        for(int i=0; i<k; i++){
            int minNumber = mat[0].length;
            int minIndex = soldiers.length;

            for(int j=0; j<soldiers.length; j++){
                if(soldiers[j] != -1){
                    if(soldiers[j] < minNumber){
                        minNumber = soldiers[j];
                        minIndex = j;
                    }
                    else if(soldiers[j] == minNumber && j<minIndex){
                        minNumber = soldiers[j];
                        minIndex = j;
                    }
                }
            }

            result[index] = minIndex;
            soldiers[minIndex] = -1;
            index++;
        }

        return result;
    }
}