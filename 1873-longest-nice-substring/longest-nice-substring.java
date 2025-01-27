class Solution {
    public String longestNiceSubstring(String s) {
        int maxLength = 0;
        String maxString = "";

        for(int i=0; i<s.length()-1; i++){
            for(int j=i+1; j<s.length(); j++){
                String string = s.substring(i,j+1);
                if(isNice(string) && string.length() > maxLength){
                    maxString = string;
                    maxLength = string.length();
                }
            }
        }

        return maxString;
    }

    public boolean isNice(String string){
        ArrayList<Character> list = new ArrayList<>();

        for(int i=0; i<string.length(); i++){
            char letter = string.charAt(i);
            list.add(letter);
        }

        for(int i=0; i<string.length(); i++){
            char letter = string.charAt(i);
            int number = (int) letter;

            char upperChar = (char) (number-32);
            char lowerChar = (char) (number+32);
            boolean upper = false;
            boolean lower = false;

            if((int) letter >= 65 && (int) letter <= 90){
                upper = true;
            }
            else if((int) letter >= 97 && (int) letter <= 122){
                lower = true;
            }

            boolean found = false;

            if(upper && list.contains(lowerChar)){
                found = true;
            }
            else if(lower && list.contains(upperChar)){
                found = true;
            }

            if(found == false){
                return false;
            }
        }

        return true;
    }
}