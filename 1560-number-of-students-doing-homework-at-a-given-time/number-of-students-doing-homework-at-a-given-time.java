class Solution {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int result = 0;

        for(int i=0; i<startTime.length; i++){
            int start = startTime[i];
            int end = endTime[i];

            if(queryTime >= start && queryTime <= end){
                result++;
            }
        }

        return result;
    }
}