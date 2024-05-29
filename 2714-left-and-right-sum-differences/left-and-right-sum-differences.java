class Solution {
    public int[] leftRightDifference(int[] nums) {
        int sum = 0;
        for(int i=0; i<nums.length; i++){
            sum = sum+nums[i];
        }

        int[] leftSum = new int[nums.length];
        int[] rightSum = new int[nums.length];
        int[] answer = new int[nums.length];
        int left = 0;
        int right = sum;
        for(int i=0; i<nums.length; i++){
            if(i==0){
                left = 0;
                right = sum-nums[i];
                leftSum[i] = left;
                rightSum[i] = right;
            }
            else{
                left = left+nums[i-1];
                right = right-nums[i];
                leftSum[i] = left;
                rightSum[i] = right;
            }
        }

        for(int i=0; i<nums.length; i++){
            int result = leftSum[i]-rightSum[i];
            if(result<0){
                result = result*-1;
            }
            answer[i] = result;
        }

        return answer;
    }
}