class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        String s1 = "";
        String s2 = "";
        String s3 = "";

        for(int i=0; i<firstWord.length(); i++){
            int value = (int) (firstWord.charAt(i)) - 97;
            s1 = s1 + value;
        }

        for(int i=0; i<secondWord.length(); i++){
            int value = (int) (secondWord.charAt(i)) - 97;
            s2 = s2 + value;
        }

        for(int i=0; i<targetWord.length(); i++){
            int value = (int) (targetWord.charAt(i)) - 97;
            s3 = s3 + value;
        }

        int num1 = Integer.parseInt(s1);
        int num2 = Integer.parseInt(s2);
        int num3 = Integer.parseInt(s3);

        if(num1 + num2 == num3){
            return true;
        }
        else{
            return false;
        }
    }
}