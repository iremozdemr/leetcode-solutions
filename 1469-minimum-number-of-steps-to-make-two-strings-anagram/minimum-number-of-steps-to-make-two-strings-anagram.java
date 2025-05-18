class Solution {
    public int minSteps(String s, String t) {
        int result = 0;

        int[] sFrequency = new int[26];
        int[] tFrequency = new int[26];

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            int index = c - 'a';
            sFrequency[index]++;
        }

        for(int i=0; i<t.length(); i++){
            char c = t.charAt(i);
            int index = c - 'a';
            tFrequency[index]++;
        }

        for(int i=0; i<sFrequency.length; i++){
            int sNumber = sFrequency[i];
            int tNumber = tFrequency[i];

            if(sNumber > tNumber){
                result = result + sNumber - tNumber;
            }
        }

        return result;
    }
}