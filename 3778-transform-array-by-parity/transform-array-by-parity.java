class Solution {
    public int[] transformArray(int[] nums) {
        int numberOfZeros = 0;
        int[] result = new int[nums.length];

        for(int i=0; i<nums.length; i++){
            if(nums[i] % 2 == 0){
                numberOfZeros++;
            }
        }

        for(int i=numberOfZeros; i<result.length; i++){
            result[i] = 1;
        }

        return result;
    }
}