class Solution {
    public String frequencySort(String s) {
        ArrayList<Character> distinctLetters = new ArrayList<>();
        ArrayList<Integer> frequency = new ArrayList<>();

        for(int i=0; i<s.length(); i++){
            if(distinctLetters.contains(s.charAt(i)) == false){
                distinctLetters.add(s.charAt(i));
                frequency.add(1);
            }
            else{
                int index = distinctLetters.indexOf(s.charAt(i));
                int number = frequency.get(index);
                frequency.set(index,number+1);
            }
        }

        sort(distinctLetters,frequency);

        String result = "";

        for(int i=0; i<distinctLetters.size(); i++){
            int number = frequency.get(i);
            char c = distinctLetters.get(i);

            for(int j=0; j<number; j++){
                result = result + c;
            }
        }

        return result;
    }

    public void sort(ArrayList<Character> distinctLetters,ArrayList<Integer> frequency){
        for(int j=0; j<frequency.size(); j++){
            for(int i=0; i<frequency.size()-1; i++){
                if(frequency.get(i) < frequency.get(i+1)){
                    int tempNumber = frequency.get(i);
                    frequency.set(i,frequency.get(i+1));
                    frequency.set(i+1,tempNumber);

                    char tempChar = distinctLetters.get(i);
                    distinctLetters.set(i,distinctLetters.get(i+1));
                    distinctLetters.set(i+1,tempChar);
                }
            }
        }
    }
}