class Solution {
    public String sortVowels(String s) {
        boolean allLettersAreVowel = true;

        for(int i=0; i<s.length(); i++){
            char letter = s.charAt(i);
            if(letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U'){
            }
            else if(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u'){
            }
            else{
                allLettersAreVowel = false;
            }
        }

        if(allLettersAreVowel){
            char[] tempArray = s.toCharArray();
            Arrays.sort(tempArray);
            return String.valueOf(tempArray);
        }

        ArrayList<Integer> vowels = new ArrayList<>();

        for(int i=0; i<s.length(); i++){
            char letter = s.charAt(i);
            if(letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U'){
                vowels.add((int)letter);
            }
            else if(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u'){
                vowels.add((int)letter);
            }
        }

        vowels.sort(null);

        int index = 0;

        for(int i=0; i<s.length(); i++){
            char letter = s.charAt(i);
            if(letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U'){
                int number = vowels.get(index);
                char c = (char) number;
                s = s.substring(0,i) + c + s.substring(i+1);
                index++;
            }
            else if(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u'){
                int number = vowels.get(index);
                char c = (char) number;
                s = s.substring(0,i) + c + s.substring(i+1);
                index++;
            }
        }

        return s;
    }
}