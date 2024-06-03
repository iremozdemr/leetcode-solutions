class Solution {
    public int missingNumber(int[] nums) {
        int lastNumber = nums.length;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            list.add(nums[i]);
        }
        for(int i=0; i<=lastNumber; i++){
            if(list.contains(i) == false){
                return i;
            }
        }
        return -1;
    }
}