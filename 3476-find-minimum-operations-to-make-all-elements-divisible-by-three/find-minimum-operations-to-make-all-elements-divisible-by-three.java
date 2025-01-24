class Solution {
    public int minimumOperations(int[] nums) {
        int sum = 0;

        for(int i=0; i<nums.length; i++){
            int number = nums[i];

            if(number % 3 != 0){
                sum += 1;
            }
        }

        return sum;
    }
}