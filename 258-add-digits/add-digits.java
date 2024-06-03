class Solution {
    public int addDigits(int num) {
        if(num < 10){
            return num;
        }
        else{
            String string = "a" + num;
            string = string.substring(1);
            int sum = 0;
            for(int i=0; i<string.length(); i++){
                char letter = string.charAt(i);
                int number = letter - '0';
                sum += number;
            }
            return addDigits(sum);
        }
    }
}