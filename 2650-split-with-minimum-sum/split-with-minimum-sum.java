class Solution {
    public int splitNum(int num) {
        ArrayList<Integer> list = new ArrayList<>();

        String string = "" + num;

        for(int i=0; i<string.length(); i++){
            String digit = string.substring(i,i+1);
            list.add(Integer.parseInt(digit));
        }

        list.sort(null);

        String num1 = "";
        String num2 = "";

        boolean addNum1 = true;

        for(int i=0; i<list.size(); i++){
            int number = list.get(i);
            if(addNum1){
                num1 = num1 + number;
                addNum1 = false;
            }
            else{
                num2 = num2 + number;
                addNum1 = true;
            }
        }

        int number1 = Integer.parseInt(num1);
        int number2 = Integer.parseInt(num2);

        return number1 + number2;
    }
}