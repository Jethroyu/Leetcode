package problemset.question142;

/**
 * @author shidu
 * @date 2020/10/10 9:50
 */

import template.ListNode;

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
class Solution {
    public ListNode detectCycle(ListNode head) {
        int ans = 0;
        ListNode fast = head;
        ListNode slow = head;
        ListNode ptr = head;
        boolean flag = false;
        if (head == null){
            return null;
        }
        while (true){
            if (flag){
                ptr = ptr.next;
            }
            if (fast.next!=null) {
                fast = fast.next;
            }
            else
            {
                ans = -1;
                break;
            }
            if (fast.next!=null) {
                fast = fast.next;
            }
            else
            {
                ans = -1;
                break;
            }
            slow = slow.next;
            if (slow.equals(fast)) {
                flag = true;
            }
            if (ptr.equals(slow))
            {
                break;
            }
        }
        if (ans == -1){
            return null;
        }
        else {
            return ptr;
        }
    }
}