class Solution {
    public int mySqrt(int x) {
        if(x == 0){
            return 0;
        }
        else if(x <= 3){
            return 1;
        }
        else{
            for(int i=1; i<=x/2; i++){
                int num1 = i;
                int num2 = i+1;

                if(x == num1*num1){
                    return num1;
                }

                if((x > num1*num1) && (x < num2*num2)){
                    return num1;
                }

                if((x > num1*num1) && (num2*num2 < 0)){
                    return num1;
                }

            }
            return -3;
        }
    }
}