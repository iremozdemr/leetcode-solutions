class Solution {
    public int uniquePaths(int m,int n) {
        int[][] array = new int[m][n];
        return helper(m,n,array);
    }

    public int helper(int m,int n,int[][] array){
        if(m==1 && n==1){
            return 1;
        }
        else if(m==0 || n==0){
            return 0;
        }
        else if(array[m-1][n-1] != 0){
            return array[m-1][n-1];
        }
        else{
            int result = helper(m-1,n,array) + helper(m,n-1,array);
            array[m-1][n-1] = result;
            return result;
        }
    }
}