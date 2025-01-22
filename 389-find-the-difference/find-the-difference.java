class Solution {
    public char findTheDifference(String s, String t) {
        ArrayList<String> listS = new ArrayList<>();
        ArrayList<String> listT = new ArrayList<>();

        for(int i=0; i<s.length(); i++){
            listS.add(s.substring(i,i+1));
        }

        for(int i=0; i<t.length(); i++){
            listT.add(t.substring(i,i+1));
        }

        char letter = 'a';

        for(int i=0; i<listT.size(); i++){
            String string = listT.get(i);

            if(listS.contains(string) == false){
                letter = string.charAt(0);
            }
            else{
                listS.remove(listS.indexOf(string));
            }
        }

        return letter;
    }
}