class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        int row = points.length;
        int column = points[0].length;

        int[][] newArray = new int[row][column];

        /*
        for(int k=0; k<row-1; k++){
            for(int i=0; i<row-1; i++){
                if(points[i][0] > points[i+1][0]){
                    int temp = points[i][0];
                    points[i][0] = points[i+1][0];
                    points[i+1][0] = temp;
                }
            }
        }
        */

        Arrays.sort(points, (a, b) -> Integer.compare(a[0], b[0]));

        int maxDifference = points[1][0] - points[0][0];

        for(int i=0; i<row-1; i++){
            int difference = points[i+1][0] - points[i][0];
            if(difference > maxDifference){
                maxDifference = difference;
            }
        }

        return maxDifference;
    }
}