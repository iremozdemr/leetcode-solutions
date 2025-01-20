class Solution {
    public boolean isPerfectSquare(int num) {
        if(num == 1){
            return true;
        }

        for(int i=0; i <= num/2; i++){
            if(i*i == num){
                return true;
            }
            if(i*i > num){
                return false;
            }
        }

        /*
        if((num/16)*(num/16) < num){
            for(int i=(num/16)-1; i <= num/2; i++){
                if(i * i == num){
                    return true;
                }
            }
        }
        else if((num/4)*(num/4) < num){
            for(int i=(num/4)-1; i <= num/2; i++){
                if(i * i == num){
                    return true;
                }
            }
        }
        else{
            for(int i=0; i <= num/2; i++){
                if(i * i == num){
                    return true;
                }
            }
        }
        */

        return false;
    }
}