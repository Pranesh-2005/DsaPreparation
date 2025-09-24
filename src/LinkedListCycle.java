public class LinkedListCycle {
    static class ListNode { int val; ListNode next; ListNode(int v){val=v;} }
    public boolean hasCycle(ListNode head) {
        if (head==null) return false;
        ListNode slow=head, fast=head.next;
        while (fast!=null && fast.next!=null) {
            if (slow==fast) return true;
            slow = slow.next;
            fast = fast.next.next;
        }
        return false;
    }
}
