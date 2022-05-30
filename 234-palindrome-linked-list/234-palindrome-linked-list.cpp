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
    bool isPalindrome(ListNode* head) {
        
        ListNode* slow = head;
        ListNode* fast = head;
        
        if(head == NULL || head->next == NULL )
            return true;
        while(slow != NULL && fast != NULL)
        {
            slow = slow->next;
            fast = fast->next;
            if(fast != NULL)
                fast = fast->next;
        }
        
        vector<int> v;
        while(slow!=NULL)
        {
           v.push_back(slow->val);
            slow = slow->next;
        }
        
        reverse(v.begin(), v.end());
        
        int i=0;
        while(i<v.size())
        {
            if( head->val != v[i++] )
                return false;
            head = head->next;
        
        }
        
       return true;
    }
};