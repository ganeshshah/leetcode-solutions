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
    public int pairSum(ListNode head) {
        
        // reverse half linkedlist
        // sum it
        
        ListNode fast = head;
        ListNode slow = head;
        
        while(fast != null && fast.next != null){
            
            fast = fast.next.next;
            slow = slow.next;
            
        }
        
        ListNode nextNode , prev = null;
        
        // reverse the half linkedlist
        
        while(slow != null){
            
            nextNode = slow.next;
            slow.next = prev;
            prev = slow;
            slow = nextNode;
            
        }
        
        ListNode start = head;
        int maximumSum = 0;
        while (prev != null) {
            maximumSum = Math.max(maximumSum, start.val + prev.val);
            prev = prev.next;
            start = start.next;
        }

        return maximumSum;
            
    }
}