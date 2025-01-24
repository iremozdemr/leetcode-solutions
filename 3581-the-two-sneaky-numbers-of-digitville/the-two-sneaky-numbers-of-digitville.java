class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        ArrayList<Integer> resultList = new ArrayList<>();
        int[] resultArray = new int[2];

        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0; i<nums.length; i++){
            int number = nums[i];

            if(list.contains(number)){
                resultList.add(number);
                System.out.println(number);
            }
            else{
                list.add(number);
            }
        }

        resultArray[0] = resultList.get(0);
        resultArray[1] = resultList.get(1);

        return resultArray;
    }
}