class Solution {
    public int differenceOfSum(int[] nums) {
        int length = nums.length;
        int elementSum = 0;
        int digitSum = 0;
        String digits = new String();

        for(int i=0; i<length; i++){
            int number = nums[i];
            elementSum += number;
            digits = digits + number;
        }

        int stringLength = digits.length();

        for(int i=0; i<stringLength; i++){
            int number = Character.getNumericValue(digits.charAt(i));
            digitSum += number;
        }

        int result = (int) Math.abs(elementSum-digitSum);
        return result;
    }
}