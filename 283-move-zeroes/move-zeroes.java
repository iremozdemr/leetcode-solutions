class Solution {
    public void moveZeroes(int[] nums) {
        for(int k=0; k<nums.length; k++){
            for(int i=0; i<nums.length-1; i++){
                if(nums[i] == 0){
                    nums[i] = nums[i+1];
                    nums[i+1] = 0;
                }
            }
        }
    }
}