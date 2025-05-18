class Solution {
    public int maxFreqSum(String s) {
        int[] frequencies = new int[26];

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            int index = c - 'a';
            frequencies[index]++;
        }

        int maxVowel = 0;
        int maxConsonant = 0;

        for(int i=0; i<frequencies.length; i++){
            if(i != 0 && i != 4 && i != 8 && i != 14 && i != 20){
                if(frequencies[i] > maxConsonant){
                    maxConsonant = frequencies[i];
                }
            }
            else{
                if(frequencies[i] > maxVowel){
                    maxVowel = frequencies[i];
                }
            }
        }

        return maxVowel + maxConsonant;
    }
}