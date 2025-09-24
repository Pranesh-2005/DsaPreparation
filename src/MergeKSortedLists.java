import java.util.*;
public class MergeKSortedLists {
    static class ListNode { int val; ListNode next; ListNode(int v){val=v;} }
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>(Comparator.comparingInt(a->a.val));
        for (ListNode node: lists) if (node!=null) pq.offer(node);
        ListNode dummy = new ListNode(0), tail = dummy;
        while (!pq.isEmpty()) {
            ListNode n = pq.poll();
            tail.next = n;
            tail = tail.next;
            if (n.next!=null) pq.offer(n.next);
        }
        return dummy.next;
    }
}
