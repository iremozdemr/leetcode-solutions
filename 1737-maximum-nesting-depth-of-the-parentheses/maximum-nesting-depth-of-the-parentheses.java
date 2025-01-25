class Solution {
    public int maxDepth(String s) {
        int leftBrackets = 0;
        int rightBrackets = 0;
        int maxVps = 0;

        for(int i=0; i<s.length(); i++){
            char letter = s.charAt(i);
            if(letter == '('){
                leftBrackets++;
            }
            if(letter == ')'){
                rightBrackets++;
            }
            int vps = leftBrackets-rightBrackets;
            if(vps > maxVps){
                maxVps = vps;
            }
        }

        return maxVps;
    }
}