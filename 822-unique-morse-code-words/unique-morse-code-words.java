class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        ArrayList<String> list = new ArrayList<>();
        String[] morse ={ ".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

        for(int i=0; i<words.length; i++){
            String word = words[i];
            String string = "";
            for(int j=0; j<word.length(); j++){
                int index = (int) (word.charAt(j)) - 97;
                string = string + morse[index];
            }
            if(list.contains(string) == false){
                list.add(string);
            }
        }

        return list.size();
    }
}