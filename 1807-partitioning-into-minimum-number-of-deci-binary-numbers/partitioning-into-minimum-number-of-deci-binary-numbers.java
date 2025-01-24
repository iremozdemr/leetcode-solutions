class Solution {
    public int minPartitions(String n) {
        int maxDigit = 0;

        for(int i=0; i<n.length(); i++){
            int digit = Integer.parseInt(n.substring(i,i+1));

            if(digit > maxDigit){
                maxDigit = digit;
            }
        }

        return maxDigit;
    }
}