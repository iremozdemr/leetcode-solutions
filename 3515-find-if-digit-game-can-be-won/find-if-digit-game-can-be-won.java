class Solution {
    public boolean canAliceWin(int[] nums) {
        int sumOneDigit = 0;
        int sumDoubleDigit = 0;
        int other = 0;

        for(int i=0; i<nums.length; i++){
            int number = nums[i];
            String string = "" + number;
            int length = string.length();
            if(length == 1){
                sumOneDigit += number;
            }
            else if(length == 2){
                sumDoubleDigit += number;
            }
            else{
                other += number;
            }
        }

        if(sumOneDigit > other+sumDoubleDigit){
            return true;
        }
        else if(sumDoubleDigit > other+sumOneDigit){
            return true;
        }
        else{
            return false;
        }
    }
}