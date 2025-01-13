class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int count = 0;

        for(int i=0; i<nums.length; i++){
            for(int j=i+2; j<nums.length; j++){
                int[] array = divide(i,j,nums);
                if(isArithmetic(array) == true){
                    count++;
                }
                else{
                    break;
                }
            }
        }

        return count;
    }

    public int[] divide(int start,int end,int[] nums){
        int length = end-start+1;
        int[] newArray = new int[length];
        if(start < 0 || end >= nums.length){
            return newArray;
        }
        else{
            for(int i=0; i<newArray.length; i++){
                newArray[i] = nums[start+i];
            }
            return newArray;
        }
    }

    public boolean isArithmetic(int[] nums){
        if(nums.length == 1){
            return false;
        }
        else if(nums.length == 2){
            return false;
        }
        else{
            int difference = nums[1]-nums[0];
            for(int i=1; i<nums.length-1; i++){
                if(nums[i+1]-nums[i] != difference){
                    return false;
                }
            }

            return true;
        }
    }
}