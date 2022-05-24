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
    ListNode* middleNode(ListNode* head) {
        
        ListNode* itr = head;
        int size = 1;
        while(itr->next !=NULL)
        {
            size++;
            itr = itr->next;
        }
        int mid = size /2;
        while(mid--)
        {
            head = head->next;
        }
        return head;
    }
};