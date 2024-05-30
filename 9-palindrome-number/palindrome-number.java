class Solution {
    public boolean isPalindrome(int x) {
        String string = "a" + x;
        string = string.substring(1);

        if(string.length() == 1){
            return true;
        }
        else if(x<0){
            return false;
        }
        else if(string.length() == 2){
            if(string.charAt(0) == string.charAt(1)){
                return true;
            }
            else{
                return false;
            }
        }
        else{
            int front = 0;
            int back = string.length()-1;

            while(front < back){
                if(string.charAt(front) != string.charAt(back)){
                    return false;
                }
                front++;
                back--;
            }
            return true;
        }
    }
}