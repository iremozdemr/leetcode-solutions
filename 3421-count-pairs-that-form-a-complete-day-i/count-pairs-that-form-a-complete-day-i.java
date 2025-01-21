class Solution {
    public int countCompleteDayPairs(int[] hours) {
        int result = 0;

        for(int i=0; i<hours.length-1; i++){
            int num1 = hours[i];
            for(int j=i+1; j<hours.length; j++){
                int num2 = hours[j];
                if((num1+num2) % 24 == 0){
                    result++;
                }
            }
        }

        return result;
    }
}