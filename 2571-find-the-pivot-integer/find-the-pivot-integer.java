class Solution {
    public int pivotInteger(int n) {
        //sum = x^2

        if(n == 1){
            return 1;
        }

        int sum = n*(n+1)/2;

        for(int i=1; i<n; i++){
            if(i*i == sum){
                return i;
            }
        }

        return -1;
    }
}