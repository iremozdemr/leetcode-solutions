class Solution {
    public int findKthLargest(int[] nums, int k) {
        int[] frequency = new int[20002];

        for(int i=0; i<nums.length; i++){
            frequency[nums[i] + 10000]++;
        }

        for(int i=frequency.length-1; i>=0; i--){
            k = k - frequency[i];
            if(k == 0 || k < 0){
                return i-10000;
            }
        }

        return 0;
    }
}