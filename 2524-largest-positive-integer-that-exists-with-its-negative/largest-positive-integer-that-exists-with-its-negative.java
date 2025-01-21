class Solution {
    public int findMaxK(int[] nums) {
        Arrays.sort(nums);
        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i=0; i<nums.length; i++){
            list.add(nums[i]);
        }

        int maxNumber = -1;

        for(int i=0; i<list.size(); i++){
            int number = list.get(i);
            if(list.contains(number*-1) && ((number>maxNumber) || (number*-1>maxNumber))){
                maxNumber = number;
            }
        }

        return maxNumber;
    }
}