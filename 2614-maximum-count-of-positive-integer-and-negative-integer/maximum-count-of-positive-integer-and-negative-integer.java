class Solution {
    public int maximumCount(int[] nums) {
        int start = 0;
        int end = nums.length-1;

        int neg = 0;
        int pos = 0;
        int zeros = 0;

        for(int i=0; i<nums.length; i++){
            if(nums[i] < 0){
                neg++;
            }
            if(nums[i] == 0){
                zeros++;
            }
            if(nums[i] > 0){
                break;
            }
        }

        pos = nums.length - neg - zeros;

        if(neg > pos){
            return neg;
        }
        else{
            return pos;
        }
    }
}