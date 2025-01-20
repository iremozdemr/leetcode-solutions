class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        String string = "" + x;

        int sum = 0;

        for(int i=0; i<string.length(); i++){
            sum += Integer.parseInt(string.substring(i,i+1));
        }

        if(x % sum == 0){
            return sum;
        }
        else{
            return -1;
        }
    }
}