class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int length = nums.length;
        int[] result = new int[length];
        int initial = length-1;

        for(int i=0; i<length; i++){
            result[i] = 0;
        }

        for(int i=0; i<length-1; i++){
            for(int j=i+1; j<length; j++){
                if(nums[i]<nums[j]){
                    result[j]++;
                }
                if(nums[i]>nums[j]){
                    result[i]++;
                }
            }
        }

        return result;
    }
}