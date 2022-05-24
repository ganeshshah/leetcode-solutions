/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* removeNthFromEnd(ListNode* head, int n) {
       
        ListNode* prev = head;
        ListNode* next = head;
        ListNode* itr = head;
        int size = 0;
        
        while(itr!=NULL)
        {
            size++;
            itr = itr->next;
        }
        int ind = size - n ;
        
        if(size == 1)
        {
            head = NULL;
            return head;
        }
        if(size == n)
        {
            head = head->next;
            return head;
        }
        while(ind--)
        {
            prev = next;
            next = next->next;
        }
        prev->next = next->next;
        next = NULL;
        
            
        return head;
    }
};