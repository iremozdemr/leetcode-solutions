class Solution {
    public int[] decompressRLElist(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0; i<nums.length-1; i+=2){
            int freq = nums[i];
            int val = nums[i+1];
            for(int j=0; j<freq; j++){
                list.add(val);
            }
        }

        int[] result = new int[list.size()];

        for(int i=0; i<result.length; i++){
            result[i] = list.get(i);
        }

        return result;
    }
}