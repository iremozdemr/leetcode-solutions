class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        
        for(int i=0; i<sentences.length; i++){
            String word = sentences[i];
            int count = 1;
            for(int j=0; j<word.length(); j++){
                char letter = word.charAt(j);
                if(Character.isWhitespace(letter)){
                    count++;
                }
            }
            if(max == 0){
                max = count;
            }
            if(count>max){
                max = count;
            }
        }
        return max;
    }
}