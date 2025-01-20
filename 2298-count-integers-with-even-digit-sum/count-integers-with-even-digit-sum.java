class Solution {
    public int countEven(int num) {
        int count = 0;
        
        for(int i=2; i<=num; i++){
            String string = i + "";
            int sum = 0;
            for(int j=0; j<string.length(); j++){
                sum += Integer.parseInt(string.substring(j,j+1));
            }
            if(sum % 2 == 0){
                count++;
            }
        }

        return count;
    }
}