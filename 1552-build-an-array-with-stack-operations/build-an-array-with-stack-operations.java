class Solution {
    public List<String> buildArray(int[] target, int n) {
        ArrayList<String> list = new ArrayList<String>();

        ArrayList<Integer> targetList = new ArrayList<Integer>();

        for(int i=0; i<target.length; i++){
            targetList.add(target[i]);
        }

        int length = n;

        if(target[target.length-1] <= n){
            length = target[target.length-1];
        }

        for(int i=1; i<=length; i++){
            if(targetList.contains(i)){
                list.add("Push");
            }
            else{
                list.add("Push");
                list.add("Pop");
            }
        }

        return list;
    }
}