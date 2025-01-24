class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        for(int i=0; i<k; i++){
            int index = findMin(nums);
            nums[index] = nums[index]*multiplier;
        }

        return nums;
    }

    public int findMin(int[] nums){
        int min = nums[0];
        int index = 0;

        for(int i=0; i<nums.length; i++){
            if(nums[i] < min){
                min = nums[i];
                index = i;
            }
        }

        return index;
    }
}