class Solution {
    public String greatestLetter(String s) {
        ArrayList<String> list = new ArrayList<>();

        for(int i=0; i<s.length(); i++){
            list.add(s.substring(i,i+1));
        }

        int maxIntValue = 0;
        String result = "";

        for(int i=0; i<list.size(); i++){
            String letter1 = list.get(i);
            String letter2 = list.get(i).toUpperCase();
            String letter3 = list.get(i).toLowerCase();
            if(list.contains(letter2) && list.contains(letter3)){
                char charValue = letter1.charAt(0);
                int intValue = (int) charValue;

                if(intValue > maxIntValue){
                    maxIntValue = intValue;
                    result = letter1.toUpperCase();
                }
            }
        }

        return result;
    }
}