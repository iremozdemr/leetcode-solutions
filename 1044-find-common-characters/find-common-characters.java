class Solution {
    public List<String> commonChars(String[] words) {
        String word1 = words[0];

        ArrayList<String> list1 = new ArrayList<>();

        for(int i=0; i<word1.length(); i++){
            list1.add(word1.substring(i,i+1));
        }

        for(int i=1; i<words.length; i++){
            String word2 = words[i];
            ArrayList<String> list2 = new ArrayList<>();
            for(int j=0; j<word2.length(); j++){
                list2.add(word2.substring(j,j+1));
            }
            for(int j=0; j<list1.size(); j++){
                String string = list1.get(j);

                if(list2.contains(string) == false){
                    list1.remove(string);
                    j--;
                }
                else{
                    list2.remove(string);
                }
            }
        }

        return list1;
    }
}