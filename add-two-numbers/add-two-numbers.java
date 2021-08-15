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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode head1 = l1;
        ListNode head2 = l2;
        int carry = 0;
        ListNode res = new ListNode();
        ListNode res2 = res;
        while( head1!=null || head2!=null )
        {
            if( head1!=null && head2==null)
            {
                ListNode temp = new ListNode((( head1.val + carry )%10),null);
                carry= (carry + head1.val )/10;
                res.next=temp;
                res = res.next;
                head1 = head1.next;
            }
            if( head2!=null && head1==null )
            {
               ListNode temp = new ListNode((( head2.val + carry )%10),null);
                carry=( carry +  head2.val)/10;
                res.next=temp;
                res = res.next;
                head2 = head2.next; 
            }
            if( head2!=null && head1!=null)
            {
                ListNode temp = new ListNode((( head1.val + head2.val + carry )%10),null);
                carry = (carry + head1.val + head2.val)/10;
                res.next=temp;
                res = res.next;
                head1 = head1.next;
                head2 = head2.next;
                
            }
        }
        
        if(carry > 0)
        {
            ListNode temp = new ListNode(carry,null);
            res.next = temp;
        }
        
        return res2.next;
        
        
    }
}