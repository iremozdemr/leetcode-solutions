class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean[] found = new boolean[26];

        for(int i=0; i<sentence.length(); i++){
            char letter = sentence.charAt(i); 
            int number = (int) (letter) - 97;
            found[number] = true;
        }

        boolean result = true;

        for(int i=0; i<found.length; i++){
            if(found[i] == false){
                return false;
            }
        }

        return true;
    }
}