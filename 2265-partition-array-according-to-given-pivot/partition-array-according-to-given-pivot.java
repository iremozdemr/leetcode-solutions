class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        ArrayList<Integer> lessThan = new ArrayList<>();
        ArrayList<Integer> equal = new ArrayList<>();
        ArrayList<Integer> moreThan = new ArrayList<>();

        for(int i=0; i<nums.length; i++){
            if(nums[i] < pivot){
                lessThan.add(nums[i]);
            }
            else if(nums[i] == pivot){
                equal.add(nums[i]);
            }
            else{
                moreThan.add(nums[i]);
            }
        }

        int index = 0;

        for(int i=0; i<lessThan.size(); i++){
            nums[index] = lessThan.get(i);
            index++;
        }

        for(int i=0; i<equal.size(); i++){
            nums[index] = equal.get(i);
            index++;
        }

        for(int i=0; i<moreThan.size(); i++){
            nums[index] = moreThan.get(i);
            index++;
        }

        return nums;
    }
}