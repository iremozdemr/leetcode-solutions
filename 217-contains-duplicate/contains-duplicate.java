class Solution {
    public boolean containsDuplicate(int[] nums) {
        int length1 = nums.length;

        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0; i<nums.length; i++){
            list.add(nums[i]);
        }

        Set<Integer> set = new HashSet<>(list);

        list.clear();

        list.addAll(set);

        int length2 = list.size();

        if(length1 == length2){
            return false;
        }
        else{
            return true;
        }
    }
}