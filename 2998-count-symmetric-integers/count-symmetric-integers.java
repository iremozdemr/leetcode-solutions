class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count = 0;

        for(int i=low; i<=high; i++){
            String string = "" + i;
            if(string.length() % 2 == 0){
                int sum1 = 0;
                int sum2 = 0;

                for(int j=0; j<string.length(); j++){
                    int number = Integer.parseInt(string.substring(j,j+1));

                    if(j < string.length() / 2){
                        sum1 += number;
                    }
                    else{
                        sum2 += number;
                    }
                }

                if(sum1 == sum2){
                    count++;
                }
            }
        }

        return count;
    }
}