class Solution {
    public int[] findEvenNumbers(int[] digits) {
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=100; i<=999; i++){
            int temp1 = i%100;
            int num1 = (i-temp1)/100;

            int temp2 = (i-(i%10))/10;
            int num2 = temp2%10;

            int num3 = i%10;

            int[] contains = new int[10]; 

            boolean found1 = false;
            boolean found2 = false;
            boolean found3 = false;

            for(int j=0; j<digits.length; j++){
                contains[digits[j]]++;
            }

            if(contains[num1] > 0){
                found1 = true;
                contains[num1]--;
            }

            if(contains[num2] > 0){
                found2 = true;
                contains[num2]--;
            }

            if(contains[num3] > 0){
                found3 = true;
                contains[num3]--;
            }

            if(found1 && found2 && found3 && i%2 == 0){
                list.add(i);
            }
        }

        int[] result = list.stream().mapToInt(i -> i).toArray();

        return result;
    }
}