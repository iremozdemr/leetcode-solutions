class Solution {
    public int findNonMinOrMax(int[] nums) {
        int minNumber = nums[0];
        int maxNumber = nums[0];
        boolean foundMin = false;
        boolean foundMax = false;

        for(int i=0; i<nums.length; i++){
            if(nums[i] < minNumber){
                minNumber = nums[i];
                foundMin = true;
            }
            if(nums[i] > maxNumber){
                maxNumber = nums[i];
                foundMax = true;
            }
        }

        for(int i=0; i<nums.length; i++){
            int number = nums[i];

            if(number != minNumber && number != maxNumber){
                return number;
            }
        }

        return -1;
    }
}