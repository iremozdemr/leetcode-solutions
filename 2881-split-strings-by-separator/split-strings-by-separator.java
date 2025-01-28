class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        ArrayList<String> list = new ArrayList<>();

        int start = 0;

        for(int i=0; i<words.size(); i++){
            String string = words.get(i);
            start = 0;
            for(int j=0; j<string.length(); j++){
                char c = string.charAt(j);
                if(c == separator){
                    String newString = string.substring(start,j);
                    if(newString.length() != 0){
                        list.add(newString);
                    }
                    start = j+1;
                }
                else if(j == string.length()-1){
                    String newString = string.substring(start,j+1);
                    if(newString.length() != 0){
                        list.add(newString);
                    }
                }
            }
        }

        return list;
    }
}