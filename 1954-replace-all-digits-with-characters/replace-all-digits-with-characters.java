class Solution {
    public String replaceDigits(String s) {
        String newString = "";

        for(int i=0; i<s.length()-1; i+=2){
            char oldLetter = s.charAt(i);
            int number = Integer.parseInt(s.substring(i+1,i+2));

            char newLetter = shift(oldLetter,number);

            newString = newString + oldLetter + newLetter;
        }

        char lastChar = s.charAt(s.length()-1);

        if(Character.isDigit(lastChar) == false){
            newString = newString + lastChar;
        }

        return newString;
    }

    public char shift(char oldLetter,int number){
        int oldIndex = (int) oldLetter;
        int newIndex = oldIndex + number;

        char newLetter = (char) newIndex;

        return newLetter;
    }
}