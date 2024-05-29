class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int result = 0;
        for(int i=0; i<items.size(); i++){
            ArrayList<String> item = (ArrayList) items.get(i);
            int index = -1;
            if(ruleKey.equals("type")){
                index = 0;
            }
            else if(ruleKey.equals("color")){
                index = 1;
            }
            else{
                index = 2;
            }

            if(item.get(index).equals(ruleValue)){
                result++;
            }
        }
        return result;
    }
}