class Solution {
    public int[] getConcatenation(int[] nums) {
        int length1 = nums.length;
        int length2 = length1*2;
        int[] result = new int[length2];

        for(int i=0; i<length2; i++){
            if(i<length1){
                result[i] = nums[i];
            }
            else{
                int index = i-length1;
                result[i] = nums[index];
            }
        }
        
        return result;
    }
}