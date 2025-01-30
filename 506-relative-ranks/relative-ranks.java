class Solution {
    public String[] findRelativeRanks(int[] score) {
        Integer[] placements = new Integer[score.length];
        int[] answer = new int[score.length];
        String[] output = new String[score.length];

        for(int i=0; i<score.length; i++){
            placements[i] = score[i];
        }

        Arrays.sort(placements, Collections.reverseOrder());

        for(int i=0; i<score.length; i++){
            int scoreValue = score[i];
            for(int j=0; j<placements.length; j++){
                int placementValue = placements[j];
                if(scoreValue == placementValue){
                    answer[i] = j+1;
                }
            }
        }

        for(int i=0; i<score.length; i++){
            if(answer[i] == 1){
                output[i] = "Gold Medal";
            }
            else if(answer[i] == 2){
                output[i] = "Silver Medal";
            }
            else if(answer[i] == 3){
                output[i] = "Bronze Medal";
            }
            else{
                output[i] = "" + answer[i];
            }
        }

        return output;
    }
}