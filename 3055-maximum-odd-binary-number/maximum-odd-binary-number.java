class Solution {
    public String maximumOddBinaryNumber(String s) {
        String result = "";
        int oneCount = 0;
        int zeroCount = 0;

        for(int i=0; i<s.length(); i++){
            String digit = s.substring(i,i+1);
            if(digit.equals("1")){
                oneCount++;
            }
            else{
                zeroCount++;
            }
        }

        if(oneCount == 1){
            for(int i=0; i<zeroCount; i++){
                result = result + "0";
            }
            result = result + "1";
        }
        else{
            for(int i=0; i<oneCount-1; i++){
                result = "1" + result;
            }
            for(int i=0; i<zeroCount; i++){
                result = result + "0";
            }
            result = result + "1";
        }

        return result;
    }
}