class Solution {
    public int countDistinctIntegers(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for(int i=0; i<nums.length; i++){
            set.add(nums[i]);

            String oldString = "" + nums[i];
            String newString = "";

            for(int j=0; j<oldString.length(); j++){
                String digit = oldString.substring(j,j+1);
                newString = digit + newString;
            }

            int newNumber = Integer.parseInt(newString);

            set.add(newNumber);
        }

        return set.size();
    }
}