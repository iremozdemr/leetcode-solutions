class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[2*n];

        int a = 0;
        for(int i=0; i<n; i++){
            result[a] = nums[i];
            a=a+2;
        }

        int b = 1;
        for(int i=n; i<2*n; i++){
            result[b] = nums[i];
            b=b+2;
        }
        return result;
    }
}