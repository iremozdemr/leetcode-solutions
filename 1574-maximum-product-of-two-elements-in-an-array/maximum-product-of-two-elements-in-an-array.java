class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int length = nums.length;
        int index1 = length-1;
        int index2 = length-2;
        int num1 = nums[index1]-1;
        int num2 = nums[index2]-1;
        return num1*num2;
    }
}