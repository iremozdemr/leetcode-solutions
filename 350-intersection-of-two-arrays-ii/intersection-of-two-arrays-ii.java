class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();

        for(int i=0; i<nums1.length; i++){
            list1.add(nums1[i]);
        }

        for(int i=0; i<nums2.length; i++){
            list2.add(nums2[i]);
        }

        for(int i=0; i<list1.size(); i++){
            int number = list1.get(i);

            if(list2.contains(number)){
                result.add(number);
                list2.remove(list2.indexOf(number));
            }
        }

        int length = result.size();

        int[] array = new int[length];

        for(int i=0; i<result.size(); i++){
            array[i] = result.get(i);
        }

        return array;
    }
}