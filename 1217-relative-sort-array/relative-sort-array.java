class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] newArray = new int[arr1.length];
        int[] frequency = new int[arr2.length];

        for(int i=0; i<arr2.length; i++){
            for(int j=0; j<arr1.length; j++){
                if(arr1[j] == arr2[i]){
                    frequency[i]++;
                }
            }   
        }

        int count = 0;

        for(int i=0; i<arr2.length; i++){
            int number = arr2[i];
            int index = frequency[i];
            for(int j=0; j<index; j++){
                newArray[count] = number;
                count++;
            }
        }

        Arrays.sort(arr1);

        for(int i=0; i<arr1.length; i++){
            boolean found = false;
            for(int j=0; j<arr2.length; j++){
                if(arr1[i] == arr2[j]){
                    found = true;
                }
            }
            if(found == false){
                newArray[count] = arr1[i];
                count++;
            }
        }

        return newArray;
    }
}