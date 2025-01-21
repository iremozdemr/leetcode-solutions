class Solution {
    public int[] diStringMatch(String s) {
        int length = s.length()+1;
        int[] result = new int[length];

        int iNumber = 0;
        int dNumber = s.length();

        for(int i=0; i<s.length(); i++){
            String letter = s.substring(i,i+1);

            if(letter.equals("I")){
                result[i] = iNumber; 
                iNumber++;
            }
            if(letter.equals("D")){
                result[i] = dNumber; 
                dNumber--;
            }
        }

        String last = s.substring(s.length()-1);

        if(last.equals("I")){
            result[result.length-1] = iNumber; 
        }
        if(last.equals("D")){
            result[result.length-1] = dNumber; 
        }

        return result;
    }
}