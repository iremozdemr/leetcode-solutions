class Solution {
    public int minimumOperations(int[] nums) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i=0; i<nums.length; i++){
            if(nums[i] != 0 && list.contains(nums[i]) == false){
                list.add(nums[i]);
            }
        }

        return list.size();
    }
}