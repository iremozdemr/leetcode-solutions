class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        ArrayList<Boolean> list = new ArrayList<>();

        for(int i=0; i<l.length; i++){
            int start = l[i];
            int end = r[i];

            ArrayList<Integer> numbers = new ArrayList<>();

            for(int j=start; j<=end; j++){
                numbers.add(nums[j]);
            }

            numbers.sort(null);

            boolean isArithmetic = true;
            int difference = numbers.get(1) - numbers.get(0);

            for(int j=0; j<numbers.size()-1; j++){
                if(numbers.get(j+1) - numbers.get(j) != difference){
                    isArithmetic = false;
                }
            }

            list.add(isArithmetic);
        } 

        return list;
    }
}