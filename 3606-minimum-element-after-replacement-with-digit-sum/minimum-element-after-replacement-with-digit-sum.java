class Solution {
    public int minElement(int[] nums) {
        int minSum = 36;

        for(int i=0; i<nums.length; i++){
            String string = "" + nums[i];

            int sum = 0;

            for(int j=0; j<string.length(); j++){
                int digit = Integer.parseInt(string.substring(j,j+1));
                sum += digit;
            }

            if(sum < minSum){
                minSum = sum;
            }
        }

        return minSum;
    }
}