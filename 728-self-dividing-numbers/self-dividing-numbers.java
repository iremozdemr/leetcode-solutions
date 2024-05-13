class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=left; i<=right; i++){
            if(isSelfDividing(i)){
                list.add(i);
            }
        }

        return list;
    }

    public boolean isSelfDividing(int number){
        String string = new String();
        string = string + number;

        if(string.contains("0")){
            return false;
        }
        else{
            int length = string.length();

            int result = 0;
            for(int i=0; i<length; i++){
                int digit = Character.getNumericValue(string.charAt(i));
                if(number%digit==0){
                    result++;
                }
            }

            if(result == length){
                return true;
            }
            else{
                return false;
            }
        }
    }
}