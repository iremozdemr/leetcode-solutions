class Solution {
    public int prefixCount(String[] words, String pref) {
        int count = 0;

        for(int i=0; i<words.length; i++){
            String word = words[i];
            boolean isPrefix = true;
            if(word.length() >= pref.length()){
                for(int j=0; j<pref.length(); j++){
                    String letter1 = word.substring(j,j+1);
                    String letter2 = pref.substring(j,j+1);
                    if(letter1.equals(letter2) == false){
                        isPrefix = false;
                    }
                }
            }
            else{
                isPrefix = false;
            }
            if(isPrefix){
                count++;
            }
        }

        return count;
    }
}