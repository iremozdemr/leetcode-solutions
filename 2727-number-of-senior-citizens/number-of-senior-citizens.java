class Solution {
    public int countSeniors(String[] details) {
        int result = 0;

        for(int i=0; i<details.length; i++){
            String string = details[i].substring(11,13);
            int age = Integer.parseInt(string);

            if(age > 60){
                result++;
            }
        }

        return result;
    }
}