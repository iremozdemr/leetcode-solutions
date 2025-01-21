class Solution {
    public int findFinalValue(int[] nums, int original) {
        Arrays.sort(nums);

        for(int i=0; i<nums.length; i++){
            if(original == nums[i]){
                original *= 2;
            }
        }

        return original;
    }
}