class Solution {
    public String restoreString(String s, int[] indices) {
        String[] newArray = new String[indices.length];

        for(int i=0; i<s.length(); i++){
            int index = indices[i];
            String letter = s.substring(i,i+1);
            newArray[index] = letter;
        }

        String result = "";

        for(int i=0; i<newArray.length; i++){
            result = result + newArray[i];
        }

        return result;
    }
}