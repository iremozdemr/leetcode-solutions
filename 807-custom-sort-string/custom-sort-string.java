class Solution {
    public String customSortString(String order, String s) {
        String result = "";

        for(int i=0; i<order.length(); i++){
            char letter1 = order.charAt(i);
            for(int j=0; j<s.length(); j++){
                char letter2 = s.charAt(j);
                if(letter2 == letter1){
                    result = result + letter2;
                    s = s.substring(0,j) + s.substring(j+1);
                    j--;
                    System.out.println(s);
                }
            }
        }

        for(int i=0; i<s.length(); i++){
            result = result + s.charAt(i);
        }

        return result;
    }
}