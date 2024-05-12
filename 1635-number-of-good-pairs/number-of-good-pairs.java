class Solution {
    public int numIdenticalPairs(int[] nums) {
        int length = nums.length;
        int result = 0;

        for(int i=0; i<length-1; i++){
            for(int j=i+1; j<length; j++){
                if(nums[i] == nums[j]){
                    result++;
                }
            }
        }

        return result;
    }
}