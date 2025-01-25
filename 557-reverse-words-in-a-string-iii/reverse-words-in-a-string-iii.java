class Solution {
    public String reverseWords(String s) {
        String result = "";

        int start = 0;
        int end = 0;

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == ' '){
                end = i;
                result = result + " " + reverse(s.substring(start,end));
                start = end+1;
            }
            if(i == s.length()-1){
                end = i+1;
                result = result + " " + reverse(s.substring(start,end));
                start = end+1;
            }
        }

        return result.substring(1);
    }

    public String reverse(String s){
        String result = "";

        for(int i=0; i<s.length(); i++){
            result = s.substring(i,i+1) + result;
        }

        return result;
    }
}