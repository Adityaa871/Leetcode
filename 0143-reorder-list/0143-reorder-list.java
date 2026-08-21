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
    public void reorderList(ListNode head) {
        ListNode curr = head;
        ListNode mid = middleNode(head);
        ListNode rev = rev(mid);

        while(curr != null && rev != null){
            ListNode temp = curr.next;
            curr.next = rev;
            curr = temp;
            temp = rev.next;
            rev.next = curr;
            rev = temp;
        }
        if(curr != null){
            curr.next = null;
        }

    }

    public ListNode rev(ListNode head){
        ListNode curr = head;
        ListNode prev = null;
        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public ListNode middleNode(ListNode head) {
        ListNode s = head;
        ListNode f = head;

        while (f != null && f.next != null) {   
            s = s.next;
            f = f.next.next;
        }
        return s;
    }
}