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
    public int getDecimalValue(ListNode head) {
        String string = new String();
        while(head != null){
            string = string + head.val;
            head = head.next;
        }
        double result = 0;
        int a = 0;
        for(int i=string.length()-1; i>=0; i--){
            int number = Character.getNumericValue(string.charAt(i));
            if(number == 1){
                result = result + Math.pow(2,a);
            }
            a++;
        }
        return (int)result;
    }
}