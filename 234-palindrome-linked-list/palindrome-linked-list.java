/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head == null){
            return false;
        }
        else{
            String string = "a";
            ListNode temp = head;

            while(temp != null){
                string = string + temp.val;
                temp = temp.next;
            }

            boolean result = isStringPalindrome(string.substring(1));
            return result;
        }
    }

    public boolean isStringPalindrome(String string){
        if(string == null){
            return false;
        }
        else if(string.length() == 1){
            return true;
        }
        else if(string.length() == 2){
            if(string.charAt(0)==string.charAt(1)){
                return true;
            }
            else{
                return false;
            }
        }
        else{
            if(string.length() % 2 == 0){
                int firstIndex = (string.length()/2);
                int secondIndex = (string.length()/2)-1;
                int count = 0;

                int index1 = 0;
                int index2 = string.length()-1;
                while(index1 < firstIndex && index2 > secondIndex){
                    if(string.charAt(index1) == string.charAt(index2)){
                        count++;
                    }
                    index1++;
                    index2--;
                }

                if(count == string.length()/2){
                    return true;
                }
                else{
                    return false;
                }
            }
            else{
                int index = string.length()/2;
                int i = 0;
                int k = string.length()-1;
                int count = 0;

                while(i<index && k>index){
                    if(string.charAt(i) == string.charAt(k)){
                        count++;
                    }
                    i++;
                    k--;
                }

                if(count == index){
                    return true;
                }
                else{
                    return false;
                }
            }
        }
    }
}