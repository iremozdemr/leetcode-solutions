class Solution {
    public String reversePrefix(String word, char ch) {
        for(int i=0; i<word.length(); i++){
            if(word.charAt(i) == ch){
                word = reverse(word.substring(0,i+1)) + word.substring(i+1);
                break;
            }
        }

        return word;
    }

    public String reverse(String s){
        String result = "";

        for(int i=0; i<s.length(); i++){
            result = s.substring(i,i+1) + result;
        }

        return result;
    }
}