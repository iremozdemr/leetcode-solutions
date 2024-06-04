class Solution {
    public int scoreOfString(String s) {
        int sum = 0;

        for(int i=0; i<s.length()-1; i++){
            int letter1 = (int) s.charAt(i);
            int letter2 = (int) s.charAt(i+1);
            int result = letter1-letter2;
            result = (int) Math.abs(result);
            sum = sum + result;
        }

        return sum;
    }
}