class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int maxDifference = (int) Math.abs(nums[0] - nums[nums.length-1]);

        for(int i=0; i<nums.length-1; i++){
            int num1 = nums[i];
            int num2 = nums[i+1];
            int difference = (int) Math.abs(num1-num2);
            if(difference > maxDifference){
                maxDifference = difference;
            }
        }

        return maxDifference;
    }
}