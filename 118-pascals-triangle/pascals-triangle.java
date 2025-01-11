class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        if(numRows == 0){
            return (List<List<Integer>>)list;
        }
        else if(numRows == 1){
            Integer[] numbers = {1};
            list.add(Arrays.asList(numbers));
            return (List<List<Integer>>)list;
        }
        else{
            Integer[] one = {1};
            list.add(Arrays.asList(one));

            for(int i=1; i<numRows; i++){
                Integer[] numbers = new Integer[i+1];
                numbers[0] = 1;
                numbers[numbers.length-1] = 1;

                if(i>1){
                    for(int j=1; j<numbers.length-1; j++){
                        numbers[j] = list.get(i-1).get(j-1) + list.get(i-1).get(j);
                    }
                }

                list.add(Arrays.asList(numbers));
            }
            return (List<List<Integer>>)list;
        }
    }
}