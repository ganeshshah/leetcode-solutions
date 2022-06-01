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
    ListNode* deleteDuplicates(ListNode* head) {
        unordered_map<int,int> dupfreq;
        ListNode* ptr = head;
        ListNode* prev = NULL;
        
        while(ptr!=NULL)
        {
           
            dupfreq[ptr->val]++;
            if(dupfreq[ptr->val] > 1)
            {
                ListNode* temp = ptr;
                prev->next = ptr->next; 
                dupfreq[ptr->val]--;
                ptr = ptr->next;
                delete temp;
               
            }
            else{
             prev = ptr;
             ptr = ptr->next;
             
            }
             
            
        }
       
        return head;
        
    }
};