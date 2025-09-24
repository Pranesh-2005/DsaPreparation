import java.util.*;
public class CopyRandomList {
    static class Node { int val; Node next, random; Node(int v){val=v;} }
    public Node copyRandomList(Node head) {
        if (head==null) return null;
        // interweave
        Node cur = head;
        while (cur!=null) {
            Node copy = new Node(cur.val);
            copy.next = cur.next;
            cur.next = copy;
            cur = copy.next;
        }
        // assign randoms
        cur = head;
        while (cur!=null) {
            if (cur.random != null) cur.next.random = cur.random.next;
            cur = cur.next.next;
        }
        // separate
        Node dummy = new Node(0), p = dummy; cur = head;
        while (cur!=null) {
            Node nxt = cur.next.next;
            p.next = cur.next;
            p = p.next;
            cur.next = nxt;
            cur = nxt;
        }
        return dummy.next;
    }
}
