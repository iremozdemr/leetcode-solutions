import java.util.*;

class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        String letter = Character.toString(x);
        int length = words.length;
        ArrayList<Integer> result = new ArrayList<>();

        for(int i=0; i<length; i++){
            if(words[i].contains(letter)){
                result.add(i);
            }
        }

        return result;
    }
}