/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
public:
    ListNode *detectCycle(ListNode *head) {
         
        unordered_map<ListNode *,int> nodefreq;
        
        while(head!=NULL)
        {
            nodefreq[head]++;
            if(nodefreq[head]>1)
            {
                return head;
            }
            head=head->next;
        }
        
        return NULL;
        
    }
};