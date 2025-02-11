class Solution {
    public String clearDigits(String s) {
        boolean foundDigit = false;
        int index = -1;

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(Character.isDigit(c)){
                foundDigit = true;
                index = i;
                break;
            }
        }

        if(foundDigit){
            s = s.substring(0,index-1) + s.substring(index+1);
            return clearDigits(s);
        }
        else{
            return s;
        }
    }
}