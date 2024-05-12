class Solution {
    public int[] runningSum(int[] nums) {
        int length = nums.length;
        int[] result = new int[length];

        int first = nums[0];
        result[0] = first;

        for(int i=1; i<length; i++){
            first = first+nums[i];
            result[i] = first;
        }

        return result;
    }
}