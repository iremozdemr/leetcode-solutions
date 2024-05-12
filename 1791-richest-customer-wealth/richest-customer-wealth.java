class Solution {
    public int maximumWealth(int[][] accounts) {
        int length = accounts.length;
        int max = 0;

        for(int i=0; i<length; i++){
            int[] customer = accounts[i];
            int customerLength = customer.length;
            int sum = 0;
            for(int j=0; j<customerLength; j++){
                sum = sum + customer[j];
            }
            if(sum > max){
                max = sum;
            }
        }

        return max;
    }
}