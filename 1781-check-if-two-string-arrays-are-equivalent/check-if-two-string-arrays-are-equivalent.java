class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        int length1 = word1.length;
        int length2 = word2.length;
        String string1 = new String();
        String string2 = new String();

        for(int i=0; i<length1; i++){
            string1 = string1 + word1[i];
        }

        for(int i=0; i<length2; i++){
            string2 = string2 + word2[i];
        }

        if(string1.equals(string2)){
            return true;
        }
        else{
            return false;
        }
    }
}