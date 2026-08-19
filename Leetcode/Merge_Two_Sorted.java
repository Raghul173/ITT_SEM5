class Solution {
public:
    ListNode* mergeTwoLists(ListNode* list1, ListNode* list2) {
        // Handle cases where one or both lists are empty
        if (list1 == nullptr) return list2;
        if (list2 == nullptr) return list1;

        ListNode* first1 = list1;
        ListNode* first2 = list2;
        ListNode* head = nullptr; // To store the start of the merged list
        ListNode* temp = nullptr; // To traverse and build the merged list

        // 1. Initialize 'head' and 'temp' with the smaller first element
        if (first1->val <= first2->val) {
            head = first1;
            first1 = first1->next;
        } else {
            head = first2;
            first2 = first2->next;
        }
        temp = head;

        // 2. Loop through both lists and attach the smaller value
        while (first1 != nullptr && first2 != nullptr) {
            if (first1->val <= first2->val) {
                temp->next = first1;
                first1 = first1->next;
            } else {
                temp->next = first2;
                first2 = first2->next;
            }
            temp = temp->next;
        }

        // 3. Attach the remaining elements of the non-empty list
        if (first1 != nullptr) {
            temp->next = first1;
        } else {
            temp->next = first2;
        }

        return head;
    }
};
