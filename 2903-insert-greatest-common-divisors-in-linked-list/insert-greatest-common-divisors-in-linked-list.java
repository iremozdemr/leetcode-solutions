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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode temp = head;

        while(temp.next != null){
            int number = findGcd(temp.val,temp.next.val);
            ListNode newNode = new ListNode(number,temp.next);
            temp.next = newNode;
            temp = temp.next.next;
        }

        return head;
    }

    public int findGcd(int a,int b){
        int index = a;

        if(a < b){
            index = a;
        }
        else if(b < a){
            index = b;
        }
        else{
            return a;
        }

        int gcd = 1;

        for(int i=1; i<=index; i++){
            if(a % i == 0 && b % i == 0){
                gcd = i;
            }
        }

        return gcd;
    }
}