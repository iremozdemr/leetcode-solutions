import java.math.BigInteger; 

class Solution {
    public String addBinary(String a, String b) {
        BigInteger sumA = BigInteger.valueOf(0);
        BigInteger sumB = BigInteger.valueOf(0);
        String result = new String();

        int indexA = a.length()-1;
        for(int i=0; i<a.length(); i++){
            int number = a.charAt(indexA) - '0';
            if(number == 1){
                BigInteger two = BigInteger.valueOf(2);
                BigInteger decimal = two.pow(i);
                sumA = sumA.add(decimal);
            }
            indexA--;
        }

        int indexB = b.length()-1;
        for(int i=0; i<b.length(); i++){
            int number = b.charAt(indexB) - '0';
            if(number == 1){
                BigInteger two = BigInteger.valueOf(2);
                BigInteger decimal = two.pow(i);
                sumB = sumB.add(decimal);
            }
            indexB--;
        }

        BigInteger sum = sumA.add(sumB);
        BigInteger zero = BigInteger.valueOf(0);
        BigInteger two = BigInteger.valueOf(2);

        if(sum.equals(zero)){
            return "0";
        }
        else{
            while(sum.equals(zero) == false){
                BigInteger binary = sum.mod(two);
                System.out.println(binary);
                sum = sum.divide(two);
                result = binary + result;
            }

            return result;
        }
    }
}