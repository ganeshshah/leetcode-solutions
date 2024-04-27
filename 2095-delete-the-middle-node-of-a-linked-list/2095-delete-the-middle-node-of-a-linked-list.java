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
    public ListNode deleteMiddle(ListNode head) {
        
        if (head.next == null)
            return null;
        
        int size = 0;

        
        ListNode itr = head;
        

        while(itr != null){
            size++;
            itr = itr.next;
        }
        
        ListNode nodeBeforeDelete = head;
        
        for(int i=0 ; i< size/2 - 1; i++){
            nodeBeforeDelete = nodeBeforeDelete.next;
        }
        
        nodeBeforeDelete.next = nodeBeforeDelete.next.next;
        
        return head;
        
    }
}