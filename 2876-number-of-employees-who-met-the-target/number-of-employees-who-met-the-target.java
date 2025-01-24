class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        Arrays.sort(hours);

        int result = 0;

        for(int i=0; i<hours.length; i++){
            if(hours[i] >= target){
                result = hours.length-i;
                break;
            }
        }

        return result;
    }
}