package problemset.question24;

import template.ListNode;

/**
 * @author shidu
 * @date 2020/10/13 10:17
 * 24. Swap Nodes in Pairs
 * Given a linked list, swap every two adjacent nodes and return its head.
 *
 * You may not modify the values in the list's nodes. Only nodes itself may be changed.
 *
 * Warning:this is a stupid solve way and stupid English doc
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode l;
        ListNode r;
        ListNode pre_l = null;
        //when the number of nodes in the list < 2
        if (head == null){
            return null;
        }
        if (head.next == null){
            return head;
        }
        //
        l = head;
        r = head.next;
        //this is a flag to sign first change,left node no predecessor,and sign head node;
        boolean flag = false;
        while (l!=null && r!=null){
            if (!flag) {
                l.next = r.next;
                r.next = l;
                pre_l = l;
                head = r;
                l = l.next;
                if (l!=null) {
                    r = r.next.next.next;
                }
                flag = true;
            }
            else {
                //just change next.
                l.next = r.next;
                r.next = l;
                pre_l.next = r;
                pre_l = pre_l.next.next;
                l = l.next;
                if (l!=null) {
                    r = r.next.next.next;
                }
            }
        }
        return head;
    }
}