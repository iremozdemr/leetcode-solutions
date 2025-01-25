class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> positives = new ArrayList<>();
        ArrayList<Integer> negatives = new ArrayList<>();

        for(int i=0; i<nums.length; i++){
            if(nums[i] > 0){
                positives.add(nums[i]);
            }
            else{
                negatives.add(nums[i]);
            }
        }

        boolean addPositive = true;
        int positiveIndex = 0;
        int negativeIndex = 0;

        for(int i=0; i<nums.length; i++){
            if(addPositive){
                nums[i] = positives.get(positiveIndex);
                positiveIndex++;
                addPositive = false;
            }
            else{
                nums[i] = negatives.get(negativeIndex);
                negativeIndex++;
                addPositive = true;
            }
        }

        return nums;
    }
}