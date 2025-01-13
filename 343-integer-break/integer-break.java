class Solution {
    public int integerBreak(int n) {
        //int[] array = {0,1,1,2,4,6,9,12,18,24,36};
        int[] array = new int[n+7];
        array[0] = 0;
        array[1] = 1;
        array[2] = 1;
        array[3] = 2;
        array[4] = 4;
        array[5] = 6;
        array[6] = 9;
        array[7] = 12;

        for(int i=8; i<array.length; i++){
            int max = 0;

            int result1 = array[i] = 3*array[i-3];
            int result2 = array[i] = 5*array[i-5];
            int result3 = array[i] = 7*array[i-7];
            int result4 = array[i] = 2*array[i-2];

            if(result1 > max){
                max = result1;
            }
            if(result2 > max){
                max = result2;
            }
            if(result3 > max){
                max = result3;
            }
            if(result3 > max){
                max = result3;
            }

            array[i] = max;
        }

        return array[n];
    }
}