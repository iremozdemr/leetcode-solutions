class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums == null){
            return 0;
        }
        else if(nums.length == 0){
            return 0;
        }
        else{
            ArrayList<Integer> list = new ArrayList<>();
            list.add(nums[0]);

            for(int i=1; i<nums.length; i++){
                if(nums[i] != list.get(list.size()-1)){
                    list.add(nums[i]);
                    System.out.println(nums[i]);
                }
            }
            
            for(int i=0; i<list.size(); i++){
                nums[i] = list.get(i);
            }

            return list.size();
        }
    }
}