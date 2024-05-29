class Solution {
    public String truncateSentence(String s, int k) {
        String[] array = new String[k];
        String result = new String();
        int index = 0;
        int prev = 0;
        for(int i=0; i<s.length(); i++){
            if(index == k){
                break;
            }
            else{
                if(s.charAt(i) == ' '){
                    array[index] = s.substring(prev,i);
                    prev = i+1;
                    index++;
                }
                if(i == s.length()-1){
                    array[k-1] = s.substring(prev,i+1);
                }
            }
        }

        for(int i=0; i<k; i++){
            if(i==0){
                result = array[0];
            }
            else{
                result = result + " " + array[i];
            }
        }

        return result;
    }
}