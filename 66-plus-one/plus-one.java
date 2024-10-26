class Solution {
    public int[] plusOne(int[] digits) {
        int number = 0;
        int length = digits.length;

        if(digits[length-1] < 9){
            digits[length-1] = digits[length-1] + 1;
            return digits;
        }
        else if(length == 1){
            int[] newArray = new int[2];
            newArray[0] = 1;
            newArray[1] = 0;
            return newArray;
        }
        else{
            boolean allNine = true;

            for(int i=0; i<digits.length; i++){
                if(digits[i] != 9){
                    allNine = false;
                }
            }

            if(allNine){
                int[] newArray = new int[length+1];
                newArray[0] = 1;
                return newArray;
            }
            else{
                digits[length-1] = digits[length-1] + 1;

                for(int i=length-1; i>=0; i--){
                    if(digits[i] == 10){
                        digits[i] = 0;
                        digits[i-1] = digits[i-1] + 1;
                    }
                }
                return digits;
            }
        }
    }
}