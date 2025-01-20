class Solution {
    public int alternateDigitSum(int n) {
        if(n <= 9){
            return n;
        }
        
        int sum = 0;

        String string = "" + n;

        int sign = 1;

        for(int i=0; i<string.length(); i++){
            sum += Integer.parseInt(string.substring(i,i+1)) * sign;
            sign = sign * -1;
        }

        return sum;
    }
}