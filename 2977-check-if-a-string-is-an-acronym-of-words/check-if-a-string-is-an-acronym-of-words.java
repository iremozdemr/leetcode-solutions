class Solution {
    public boolean isAcronym(List<String> words, String s) {
        String newWord = "";

        for(int i=0; i<words.size(); i++){
            String string = words.get(i);
            newWord = newWord + string.substring(0,1);
        }

        if(newWord.equals(s)){
            return true;
        }
        else{
            return false;
        }
    }
}