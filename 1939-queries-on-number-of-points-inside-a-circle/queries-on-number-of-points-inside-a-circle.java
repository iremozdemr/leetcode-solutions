class Solution {
    public int[] countPoints(int[][] points, int[][] queries) {
        int[] answer = new int[queries.length];

        for(int i=0; i<queries.length; i++){
            int x1 = queries[i][0];
            int y1 = queries[i][1];
            int r = queries[i][2];

            for(int j=0; j<points.length; j++){
                int x2 = points[j][0];
                int y2 = points[j][1];

                double distance = (Math.abs(x1-x2)*Math.abs(x1-x2)) + (Math.abs(y1-y2)*Math.abs(y1-y2));
                distance = Math.sqrt(distance);

                if(distance <= r){
                    answer[i]++;
                }
            }
        }

        return answer;
    }
}