class Solution {
    public int numberOfBeams(String[] bank) {
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0; i<bank.length; i++){
            String string = bank[i];
            int count = 0;

            for(int j=0; j<string.length(); j++){
                String digit = string.substring(j,j+1);
                if(digit.equals("1")){
                    count++;
                }
            }

            if(count != 0){
                list.add(count);
            }
        }

        int sum = 0;

        int i=0;
        int j=1;

        while(i<list.size() && j<list.size()){
            int num1 = list.get(i);
            int num2 = list.get(j);

            sum = sum + (num1*num2);

            i=j;
            j=j+1;
        }

        return sum;
    }
}