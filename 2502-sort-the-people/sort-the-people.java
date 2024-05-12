class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int length = heights.length;

        for(int i=0; i<length; i++){
            for(int j=0; j<length; j++){
                if(i<j && heights[i] < heights[j]){
                    int temp1 = heights[i];
                    heights[i] = heights[j];
                    heights[j] = temp1;

                    String temp2 = names[i];
                    names[i] = names[j];
                    names[j] = temp2;
                }
            }
        }

        return names;
    }
}