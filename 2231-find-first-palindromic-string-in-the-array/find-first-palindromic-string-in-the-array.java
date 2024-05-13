class Solution {
    public String firstPalindrome(String[] words) {
        int length = words.length;
        for(int i=0; i<length; i++){
            String word = words[i];
            boolean result = isPalindrome(word);
            if(result){
                return word;
            }
        }
        return "";
    }

    public boolean isPalindrome(String word){
        int length = word.length();

        if(length == 1){
            return true;
        }
        else if(length == 2){
            if(word.charAt(0) == word.charAt(1)){
                return true;
            }
            else{
                return false;
            }
        }
        else{
            int stop1 = 0;
            int stop2 = 0;
            if(length%2==0){
                stop1 = length/2;
                stop2 = (length/2)-1;
            }
            else{
                stop1 = length/2;
                stop2 = length/2;
            }

            int i = 0;
            int j = length-1;
            boolean result = true;

            while(i<stop1 && j>stop2){
                if(word.charAt(i) != word.charAt(j)){
                    result = false;
                }
                i++;
                j--;
            }
            return result;
        }
    }
}