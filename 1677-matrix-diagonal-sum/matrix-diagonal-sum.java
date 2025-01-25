class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;

        int index1 = 0;
        int index2 = mat.length-1;

        for(int i=0; i<mat.length; i++){
            int num1 = mat[i][index1];
            int num2 = mat[i][index2];
            sum = sum + num1 + num2;
            index1++;
            index2--;
        }

        if(mat.length % 2 != 0){
            int index = mat.length/2;
            int number = mat[index][index];
            sum = sum - number;
        }

        return sum;
    }
}