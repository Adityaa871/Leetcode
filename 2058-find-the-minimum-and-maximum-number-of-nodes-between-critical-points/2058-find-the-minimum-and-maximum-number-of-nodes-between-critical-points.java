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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int [] arr = {Integer.MAX_VALUE,-1};
        int i = 0;
        ArrayList<Integer> ll = new ArrayList<>();
        ListNode curr = head;
        ListNode prev = null;
        while(curr.next != null){
            i++;
            ListNode nxt = curr.next;
            if(prev != null && nxt != null && prev.val < curr.val && nxt.val < curr.val){
                ll.add(i);
            }
            if(prev != null && nxt != null && prev.val > curr.val &&  nxt.val >curr.val){
               ll.add(i);
            }
            prev = curr;
            curr = curr.next;
        }
        if(ll.size() >0){
            arr[1] = ll.get(ll.size()-1) - ll.get(0);
            for(int j=1; j<ll.size(); j++){
                arr[0] = Math.min(arr[0], ll.get(j)-ll.get(j-1));
            }
        }
        if(arr[0] == Integer.MAX_VALUE) arr[0] = -1;
        if(arr[1] == 0) arr[1] = -1;
        return arr;
    }
}