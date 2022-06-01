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
    ListNode* addTwoNumbers(ListNode* l1, ListNode* l2) {
        
        ListNode* num1 = l1;
        ListNode* num2 = l2;
        vector<int> v;
        
        int carry = 0;
        
        while(num1 != NULL || num2 != NULL)
        {
            int first,second;
           if(num2 == NULL)
           {
              first = num1->val; 
               second = 0;
               num1 = num1->next;
           }
            else if(num1 == NULL)
            {
               first = 0; 
               second = num2->val;
               num2 = num2->next;
            }
            else
            {
                first = num1->val;
                second = num2->val;
                num1 = num1->next;
                num2 = num2->next;
            }
            int add = carry + first + second;
            carry = add/10;
            int sum = add%10;
            v.push_back(sum);
            
        }
        if(carry!=0)
            v.push_back(carry);
            
        ListNode* ans = NULL;
        ListNode* link;
        for(int i=0;i<v.size();i++)
        {
            cout<<v[i]<<" ";
            ListNode* temp = new ListNode(v[i]);
            if(ans == NULL)
            {
                ans = temp;
                link = temp;
            }
            else
            {
                ans->next = temp; 
                ans = ans->next;
            }  
        }
        
       
        return link;
        
        
    }
};