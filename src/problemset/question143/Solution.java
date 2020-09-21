package problemset.question143;

import template.ListNode;

import java.util.LinkedList;

/**
 * @author shidu
 * @date 2020/9/14 14:52
 */
class Solution {
    public void reorderList(ListNode head) {
        if (head == null) {
            return;
        }
        LinkedList<ListNode> doubleQueue = new LinkedList<>();
        ListNode ans = head;
        while (ans!=null){
            doubleQueue.add(ans);
            ans = ans.next;
        }
        ans = head;
        doubleQueue.pollFirst();
        while (!doubleQueue.isEmpty()){
            ans.next = doubleQueue.pollLast();
            ans = ans.next;
            ans.next = null;

            if (!doubleQueue.isEmpty()) {
                ans.next = doubleQueue.pollFirst();
                ans = ans.next;
                ans.next = null;
            }
        }
        return;
    }
}