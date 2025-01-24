class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int[] result = new int[A.length];

        for(int i=0; i<A.length; i++){
            ArrayList<Integer> listA = new ArrayList<>();
            ArrayList<Integer> listB = new ArrayList<>();

            for(int j=0; j<=i; j++){
                listA.add(A[j]);
                listB.add(B[j]);
            }
            for(int j=0; j<listA.size(); j++){
                int number = listA.get(j);

                if(listB.contains(number)){
                    result[i]++;
                }
            }
        }

        return result;
    }
}