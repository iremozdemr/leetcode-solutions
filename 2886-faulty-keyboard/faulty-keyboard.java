class Solution {
    public String finalString(String s) {
        for(int i=0; i<s.length(); i++){
            char letter = s.charAt(i);
            if(letter == 'i'){
                s = reverse(s.substring(0,i)) + s.substring(i+1);
                i--;
            }
        }

        return s;
    }

    public String reverse(String string){
        String result = "";

        for(int i=0; i<string.length(); i++){
            result = string.substring(i,i+1) + result;
        }

        return result;
    }
}